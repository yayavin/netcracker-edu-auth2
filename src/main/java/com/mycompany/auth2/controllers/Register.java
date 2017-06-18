package com.mycompany.auth2.controllers;

import com.mycompany.auth2.entitys.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
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
    public String registration(User user){
        
        boolean isLogIn = false;
        
        //запрашиваю логин из базы
        
        //если такого не существует, то хэширую пароль и добавляю новую учетку
        
        //генерирую SessionID и возвращаю
        
        if(isLogIn){
            return "redirect:/welcome_page";
        }else{
            return "redirect:/error_page_false_login";
        }
        
    }
    
}
