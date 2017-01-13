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
public class UserReaderStub extends UserReader{

	public UserReaderStub(UserParser userParser) {
		super(userParser);	
	}

	@Override
	User[] readUsers() {
		return new User[] {
			new User(1, "Name1"),
			new User(2, "Name2")
		};
	}
	
}
