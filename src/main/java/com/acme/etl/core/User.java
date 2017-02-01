package com.acme.etl.core;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vm.andreev
 */

@XmlRootElement
public class User implements Serializable{
    

    private  int id;
    private  String name; 
    
    public User(){
        
    }
    
    
        
    
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    
    
  
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
            return String.format("<User id: %d, name: %s>", id, name);
    }
}
