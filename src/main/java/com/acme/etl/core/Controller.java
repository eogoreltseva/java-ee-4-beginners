package com.acme.etl.core;

import com.acme.etl.extractor.UserReader;
import com.acme.etl.loader.UserWriter;

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

	public void doETL() {
		User[] users = userReader.readUsers();
		for (UserWriter userWriter : userWriters) {
			userWriter.save(users);
		}

	}
}
