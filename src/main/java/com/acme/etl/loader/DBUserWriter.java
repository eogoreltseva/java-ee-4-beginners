/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.etl.loader;

import com.acme.etl.core.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ogoreltseva
 */
public class DBUserWriter implements UserWriter {

    /**
     *
     * @param users
     * @throws UserWriterException
     */
    @Override
    public void save(Collection<User> users) throws UserWriterException {
//        Class.forName("");
        try (Connection connection = 
DriverManager.getConnection("jdbc:derby://localhost:1527/sample;", "app", "app");) {
            PreparedStatement s = connection.prepareStatement("INSERT INTO USERS VALUES(?, ?)");
            for (User user: users) {
                s.setInt(1, user.getId());
                s.setString(2, user.getName());
                s.executeUpdate();
                
                System.out.println("User " + user.getName() + " has been saved to DB");
            }
            
    }   catch (SQLException ex) {
            Logger.getLogger(DBUserWriter.class.getName()).log(Level.SEVERE, null, ex);
            throw new UserWriterException("Cannot write to DB", ex);
        }
    }
}
