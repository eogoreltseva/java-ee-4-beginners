package com.acme.etl.extractor;

import com.acme.etl.core.User;

import java.io.IOException;
import java.util.Collection;
import javax.xml.bind.JAXBException;

/**
 *
 * @author vm.andreev
 */
public interface UserReader {

	Collection readUsers() throws IOException, FileFormatException, JAXBException;
}
