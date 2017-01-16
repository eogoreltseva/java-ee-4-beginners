package com.acme.etl.extractor;

import com.acme.etl.core.User;

import java.io.IOException;

/**
 * Created by vm.andreev on 16.01.17.
 */
public class UserReaderCSV implements UserReader {

    private BatchedBufferReader batchedBufferReader;

    public UserReaderCSV(BatchedBufferReader batchedBufferReader) {
        this.batchedBufferReader = batchedBufferReader;
    }

    @Override
    public User[] readUsers() throws IOException {
        String[] userStrings = batchedBufferReader.read();
        User[] users = new User[userStrings.length];
        int i = 0;
        for (String userString : userStrings) {
            String[] userParameters = userString.split(",");
            users[i] = new User(Integer.parseInt(userParameters[0]), userParameters[1]);
            i++;
        }
        return users;
    }
}
