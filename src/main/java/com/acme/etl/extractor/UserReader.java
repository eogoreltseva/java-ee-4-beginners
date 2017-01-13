package com.acme.etl.extractor;

import com.acme.etl.core.User;

/**
 *
 * @author vm.andreev
 */
public interface UserReader {

	User[] readUsers();
}
