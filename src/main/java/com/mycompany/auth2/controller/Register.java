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
public class Register {
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registration(){
        
        boolean isLogIn = false;
        
        //запрашиваю логин из базы
        
        //если такого не существует, то хэширую пароль и добавляю новую учетку
        
        //генерирую SessionID и возвращаю
        
        if(isLogIn){
            return "";
        }else{
            return "";
        }
        
    }
    
}
