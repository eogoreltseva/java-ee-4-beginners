/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.etl.loader;

/**
 *
 * @author Ogoreltseva
 */
public class UserWriterException extends Exception {

    public UserWriterException() {
    }

    public UserWriterException(String string) {
        super(string);
    }

    public UserWriterException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public UserWriterException(Throwable thrwbl) {
        super(thrwbl);
    }

    public UserWriterException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
