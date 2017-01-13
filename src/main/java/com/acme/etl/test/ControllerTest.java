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
	 * @param args input params
	 */
	public static void main(String[] args) {
		Controller controller = new Controller(
				new UserReaderStub(),
				new UserWriterStub("LDAP"), new UserWriterStub("DB")
		);

		controller.doETL();
	}
}
