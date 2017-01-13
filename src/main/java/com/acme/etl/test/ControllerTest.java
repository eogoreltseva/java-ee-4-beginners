package com.acme.etl.test;

import com.acme.etl.core.Controller;

/**
 *
 * @author vm.andreev
 */
public class ControllerTest {

	/**
	 * Test ETL
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Controller ctrl = new Controller(
				new UserReaderStub(),
				new UserWriterStub("LDAP"), new UserWriterStub("DB")
		);

		ctrl.doETL();
	}
}
