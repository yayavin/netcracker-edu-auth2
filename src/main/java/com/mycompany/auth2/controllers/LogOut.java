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
public class LogOut {
    
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logOut(User user){
        
        boolean isLogIn = false;
        
        //проверяю, залогинен ли пользователь
        
        //отправляю разлог в базу
        
        if(isLogIn){
            return "redirect:/index";
        }else{
            return "redirect:/error_page_false_logout";
        }
        
    }        
    
}
