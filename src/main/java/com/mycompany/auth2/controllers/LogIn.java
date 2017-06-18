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
public class LogIn {
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String logIn(User user){
        
        boolean isLogIn = false;
        
        //проверяю, залогинен ли пользователь
        
        //хэширую пароль (только пароль или пароль + логин?)
        
        //запрашиваю хэш у базы
        
        //сравниваю хэши и возвращаю SessionID
        //редиректить на страницы не REST-ово. Подфикшу позднее
        if(isLogIn){
            return "redirect:/welcome_page";
        }else{
            return "redirect:/error_page_false_login";
        }
        
    }
}