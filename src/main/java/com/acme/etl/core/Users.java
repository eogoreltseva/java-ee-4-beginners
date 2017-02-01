package com.acme.etl.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.acme.etl.core.User;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author aa.khanov
 */
@XmlRootElement
public class Users {
        
    
    private Collection<User> users;
    
    public Users(){
        
    }
   
    
    public Collection<User> getUsers(){
        return users;
    }
    
    @XmlElement(name = "user")
    public void setUsers(Collection<User> users){
        this.users=users;
    }
}
