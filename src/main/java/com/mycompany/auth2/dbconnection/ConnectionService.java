/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.auth2.dbconnection;

import com.mycompany.auth2.entitys.User;
import org.springframework.stereotype.Service;

/**
 *
 * @author ya
 */

@Service
public class ConnectionService {
    
    public static String sendToDatabase(User user){
        
        return "";
    }
    
    public static User receiveFromDatabase(String login){
        
        User user = null;
        
        //здесь же фиксим lastConnection
        //если >10 минут, то обнуляем и возвращаем
        
        return user;
    }
    
    public static boolean addNewUser(User user){
        
        //добавить логику
        
        return true;
    }
    
}
