/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.auth2.entitys;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ya
 */

@Entity
public class User {
    
    @Id
    private Integer id;
    
    private String login;
    
    private String email;
    
    private String hashedPsw;
    
    private Date lastActivity;
    
    private int sessionID;
    
    //--------------------------------------------------------------------------
    
    public void setID(Integer id){
        this.id = id;
    }
    
    public Integer getID(){
        return id;
    }
    
    //--------------------------------
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getLogin(){
        return login;
    }
    
    //--------------------------------
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    //--------------------------------
    
    public void setHashedPassword(String psw){
        this.hashedPsw = psw;
    }
    
    public String getHashedPassword(){
        return hashedPsw;
    }
    
    //--------------------------------
    
    public void setSessionID(int sessionID){
        this.sessionID = sessionID;
    }
    
    public int getSessionID(){
        return sessionID;
    }
    
    //--------------------------------
    
    public void setLastActivity(){
        //updating lastActivity in DB
    }
    
    public Date getLastActivity(){
        return lastActivity;
    }
    
}
