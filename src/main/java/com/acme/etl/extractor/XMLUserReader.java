package com.acme.etl.extractor;

import com.acme.etl.core.User;
import com.acme.etl.core.Users;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * Created by vm.andreev on 16.01.17.
 */
public class XMLUserReader implements UserReader {

    private File file;
    
    public XMLUserReader(File file) {
        this.file = file;
    }
    
    private File getFile(){
        return this.file;
    }
 
    @Override
    public Collection readUsers() throws IOException, FileFormatException, JAXBException {
       
        JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Users users = (Users) jaxbUnmarshaller.unmarshal(file);              

        return users.getUsers();
    }
}
