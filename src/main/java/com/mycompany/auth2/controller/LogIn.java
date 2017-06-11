package com.mycompany.auth2.controller;

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
    public String logIn(){
        
        boolean isLogIn = false;
        
        //проверяю, залогинен ли пользователь
        
        //хэширую пароль
        
        //запрашиваю хэш у базы
        
        //сравниваю хэши и возвращаю SessionID
        if(isLogIn){
            return "";
        }else{
            return "";
        }
        
    }
}
