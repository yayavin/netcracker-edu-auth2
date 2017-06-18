package com.mycompany.auth2.controllers;

import com.mycompany.auth2.dbconnection.ConnectionService;
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
    public String logOut(String login){
        
        User user = ConnectionService.receiveFromDatabase(login);
        
        //проверяю, залогинен ли пользователь
        if(!user.getLastActivity().equals(null)){
            return "redirect:/error_page_false_logout";
        }
        
        //отправляю разлог в базу
        //ConnectionService.sendToDatabase(user);
        
        return "redirect:/index";
        
    }        
    
}
