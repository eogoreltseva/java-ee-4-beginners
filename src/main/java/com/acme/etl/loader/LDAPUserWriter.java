/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.etl.loader;

import com.acme.etl.core.User;
import java.util.Collection;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;
import javax.naming.directory.*;

/**
 *
 * @author Ogoreltseva
 */
public class LDAPUserWriter implements UserWriter {

    /**
     *
     * @param users
     * @throws UserWriterException
     */
    @Override
    public void save(Collection<User> users) throws UserWriterException {

        
        DirContext initialDirContext = null;
        DirContext usersContext = null;
        DirContext adminsContext = null;
        
        try {
            
            
            Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            props.put(Context.PROVIDER_URL, "ldap://localhost:10389/ou=system");
            
            props.put(Context.SECURITY_AUTHENTICATION, "simple");
            props.put(Context.SECURITY_PRINCIPAL, "uid=admin, ou=system");
            props.put(Context.SECURITY_CREDENTIALS, "secret");
            
            props.put("com.sun.jndi.ldap.connect.timeout", "5000");
            props.put("com.sun.jndi.ldap.connect.pool", "true");
            props.put("com.sun.jndi.ldap.connect.pool.debug", "fine");
            
            initialDirContext = new InitialDirContext(props);
            usersContext = (DirContext)initialDirContext.lookup("ou=users");
            

            
            try{
                initialDirContext.lookup("ou=users,ou=admins");
            } catch (NameNotFoundException ex){
                Attributes attrs = new BasicAttributes(true);
                Attribute objclass = new BasicAttribute("objectclass");
                objclass.add("top");
                objclass.add("organizationalunit");
                attrs.put(objclass);
                usersContext.createSubcontext("ou=admins",attrs);
            }
            
            
            adminsContext = (DirContext)usersContext.lookup("ou=admins");
            
            
            for(User user : users){
               Attributes personAttributes = new BasicAttributes();
               BasicAttribute personBasicAttribute = new BasicAttribute("objectclass");
               personBasicAttribute.add("top");
               personBasicAttribute.add("person");
               personBasicAttribute.add("uidObject");
               personAttributes.put(personBasicAttribute);
               personAttributes.put("uid",new Integer(user.getId()).toString());
               personAttributes.put("sn",user.getName());
               adminsContext.rebind("cn=" + user.getName(), user, personAttributes);
               
               System.out.println("User " + user + " has been saved to LDAP");
            }
            
            
            
            
        } catch (NamingException ex) {
            Logger.getLogger(LDAPUserWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (initialDirContext != null){
                try {
                    initialDirContext.close();
                } catch (NamingException ex) {
                    Logger.getLogger(LDAPUserWriter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        
    }
}
