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
public class Controller {
	private UserReader userReader;
	private UserWriter[] userWriters;
	
	public Controller(UserReader userReader, UserWriter... userWriters) {
		this.userReader = userReader;
		this.userWriters = userWriters;
	} 
	
	public void doETL() {
		User[] users = userReader.readUsers();
		for (UserWriter userWriter : userWriters){
			userWriter.save(users);
		}
		
	}
}
