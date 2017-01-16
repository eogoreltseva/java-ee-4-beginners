package com.acme.etl.test;

import com.acme.etl.core.Controller;
import com.acme.etl.extractor.BatchedBufferReader;
import com.acme.etl.extractor.UserReaderCSV;

import java.io.*;

/**
 * @author vm.andreev
 */
public class ControllerTest {

    /**
     * Test ETL
     *
     * @param args input params
     */
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller(
                new UserReaderCSV(new BatchedBufferReader(3, new BufferedReader(new FileReader(new File(args[0]))))),
                new UserWriterStub("LDAP"), new UserWriterStub("DB")
        );

        controller.doETL();

    }
}
