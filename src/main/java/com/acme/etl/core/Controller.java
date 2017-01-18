package com.acme.etl.core;

import com.acme.etl.extractor.FileFormatException;
import com.acme.etl.extractor.UserReader;
import com.acme.etl.loader.UserWriter;
import com.acme.etl.loader.UserWriterException;

import java.io.IOException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vm.andreev
 */
public class Controller {

	private final UserReader userReader;
	private final UserWriter[] userWriters;

	/**
	 *
	 * @param userReader
	 * @param userWriters
	 */
	public Controller(UserReader userReader, UserWriter... userWriters) {
		this.userReader = userReader;
		this.userWriters = userWriters;
	}

	public void doETL() throws IOException, FileFormatException {
            Collection users = null;
		while( (users = userReader.readUsers()) != null){
                    for (UserWriter userWriter : userWriters) {
                        try {
                            userWriter.save(users);
                        } catch (UserWriterException ex) {
                            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
		} 
	}
}
