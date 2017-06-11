/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.auth2.entitys;

import javafx.scene.chart.PieChart.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ya
 */

@Entity
@Table(name = "Users") //настроить
public class User {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;
    
    @Column(name = "LOGIN")
    private String login;
    
    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "PASSWORD")
    private String psw;
    
    @Column(name = "OLD_PASSWORD")
    private String oldPsw;
    
    @Column(name = "LAST_ACTIVITY")
    private Data lastActivity;
    
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
    
    public void setPassword(String psw){
        this.psw = psw;
    }
    
    public String getPassword(){
        return psw;
    }
    
    //--------------------------------
    
    public void setOldPassword(String oldPsw){
        this.oldPsw = oldPsw;
    }
    
    public String getOldPassword(){
        return oldPsw;
    }
    
    //--------------------------------
    
    public void setLogin(Data lastActivity){
        this.lastActivity = lastActivity;
    }
    
    public Data getLastActivity(){
        return lastActivity;
    }
    
}
