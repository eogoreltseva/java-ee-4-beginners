package com.acme.etl.test;

import com.acme.etl.core.Controller;
import com.acme.etl.extractor.BatchedBufferReader;
import com.acme.etl.extractor.CSVUserReader;
import com.acme.etl.extractor.FileFormatException;
import com.acme.etl.extractor.XMLUserReader;
import com.acme.etl.loader.DBUserWriter;
import com.acme.etl.loader.LDAPUserWriter;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;

/**
 * @author vm.andreev
 */
public class ControllerTest {

    /**
     * Test ETL
     *
     * @param args input params
     */
    public static void main(String[] args)  {
        try {
            
            Logger log = Logger.getLogger(ControllerTest.class.getName());
            /*
            try (CSVUserReader csvUserReader = new CSVUserReader(
                    new BatchedBufferReader(3,
                            new BufferedReader(
                                    new FileReader(
                                            new File(args[0])))))) {
                Controller controller;
                controller = new Controller(
                        csvUserReader,
                        new LDAPUserWriter(), new DBUserWriter()                       
                );
                
                controller.doETL();
            }
            */
            
  
            XMLUserReader xmlUserReader = new XMLUserReader(new File(args[0]));
            Controller controller;
            controller = new Controller(
                    xmlUserReader,
                    new LDAPUserWriter(), new DBUserWriter()                       
            );

            controller.doETL();

            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | FileFormatException ex) {
            Logger.getLogger(ControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(ControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }   
    } 
}

// TODO: Exceptions, Collections, Refactoring