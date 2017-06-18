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
public class LogIn {
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String logIn(String login, String psw){
        
        boolean isLogIn = false;
        
        User user = ConnectionService.receiveFromDatabase(login);
        
        if(!user.getLastActivity().equals(null)){
            return "redirect:/error_page_false_twice_login";
        }
        
        //хэширую пароль (только пароль или пароль + логин?)
        //хэширую только пароль
        //----------------------------------------------------------------------
        String hashedPsw = DigestUtils.md5DigestAsHex(psw.getBytes());
        
        //хэширую пароль и логин
        //----------------------------------------------------------------------
        String hashedPswAndLogin = DigestUtils.md5DigestAsHex((psw + login).getBytes());
        
        //сравниваю хэши
        //подправить само сравнение
        if(hashedPsw.equals(user.getHashedPassword()) || hashedPswAndLogin.equals(user.getHashedPassword())){
            String sessionID = DigestUtils.md5DigestAsHex((user.getLogin() + (new Date())).getBytes());
            isLogIn = true;
        }
        
        //редиректить на страницы не REST-ово. Подфикшу позднее
        //и ваще, я возвращаю sessionID по идее
        if(isLogIn){
            return "redirect:/welcome_page";
        }else{
            return "redirect:/error_page_false_login";
        }
        
    }
}
