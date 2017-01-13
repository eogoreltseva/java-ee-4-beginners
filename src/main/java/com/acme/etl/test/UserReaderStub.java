package com.acme.etl.test;

import com.acme.etl.extractor.UserReader;
import com.acme.etl.core.User;

/**
 *
 * @author vm.andreev
 */
class UserReaderStub implements UserReader {

	/**
	 * Read users from file
	 *
	 * @return
	 */
	@Override
	public User[] readUsers() {
		return new User[]{
			new User(1, "First User"),
			new User(2, "Second User")
		};
	}

}
