package com.mycompany.auth2.controllers;

import com.mycompany.auth2.dbconnection.ConnectionService;
import com.mycompany.auth2.entitys.User;
import java.util.Date;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ya
 */

@Controller
@EnableAutoConfiguration
public class Register {
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registration(String login, String email, String psw){
        
        User user = ConnectionService.receiveFromDatabase(login);
        
        if(!user.equals(null)){
            return "redirect:/error_page_false_login";
        }
        
        //если такого не существует, то хэширую пароль и добавляю новую учетку
        user.setLogin(login);
        //подкорректировать в зависимости от хэша
        user.setHashedPassword(DigestUtils.md5DigestAsHex(psw.getBytes()));
        user.setEmail(email);
        
        //генерирую SessionID и возвращаю
        String sessionID = DigestUtils.md5DigestAsHex((user.getLogin() + (new Date())).getBytes());
        
        //записываем нового юзера в бд
        ConnectionService.addNewUser(user);
        
        return sessionID;
        
    }
    
}
