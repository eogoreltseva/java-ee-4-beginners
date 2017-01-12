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
class User {
	private int id;
	private String name;
	
	public User (int id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return this.id + " " + this.name;
	}
}
