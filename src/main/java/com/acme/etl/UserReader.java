/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.etl;

/**
 *
 * @author vm.andreev
 */
abstract class UserReader {
	
	private UserParser userParser;
	
	public UserReader(UserParser userParser) {
		this.userParser = userParser;
	}

	abstract User[] readUsers();	
}
