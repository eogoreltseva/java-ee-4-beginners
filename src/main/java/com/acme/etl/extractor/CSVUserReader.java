package com.acme.etl.extractor;

import com.acme.etl.core.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by vm.andreev on 16.01.17.
 */
public class CSVUserReader implements UserReader, AutoCloseable {

    private BatchedBufferReader batchedBufferReader;

    public CSVUserReader(BatchedBufferReader batchedBufferReader) {
        this.batchedBufferReader = batchedBufferReader;
    }

    @Override
    public Collection readUsers() throws IOException, FileFormatException {
        if (batchedBufferReader.hasNext()) {
            String[] userStrings = batchedBufferReader.readBatch();
            Collection users = new ArrayList<User>(batchedBufferReader.getBatchSize());
            int i = 0;
            for (String userString : userStrings) {
                if (userString != null) {
                    String[] userParameters = userString.split(",");
                    if (userParameters.length != 2){
                        throw new FileFormatException("Incorect file format");
                    }
                    users.add(new User(Integer.parseInt(userParameters[0]), userParameters[1]));
                    i++;
                } else {
                    break;
                }
            }
            return users;
        } else {
            return null;
        }
    }

    @Override
    public void close() throws IOException {
        this.batchedBufferReader.close();
    }
}
