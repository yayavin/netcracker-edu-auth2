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
public class LogOut {
    
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logOut(){
        
        boolean isLogIn = false;
        
        //проверяю, залогинен ли пользователь
        
        if(isLogIn){
            return "";
        }else{
            return "";
        }
        
    }        
    
}
