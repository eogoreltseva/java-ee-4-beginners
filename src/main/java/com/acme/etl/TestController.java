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
public class TestController {
	public  static  void main(String[] args) {
		Controller ctrl = new Controller(
			new UserReaderStub(new UserParser()),
			new UserWriterStub("LDAP"), new UserWriterStub("DB")
		);
		
		ctrl.doETL();
	}	
}
