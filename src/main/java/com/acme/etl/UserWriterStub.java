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
public class UserWriterStub implements UserWriter {

	private String instance;
	public UserWriterStub(String instance) {
		this.instance = instance;
	}

	@Override
	public void save(User[] users) {
		for (User user : users) {
			System.out.println("Save user: " + user + " to " + instance);
		}
	}
	
}
