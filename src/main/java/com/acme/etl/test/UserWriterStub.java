package com.acme.etl.test;

import com.acme.etl.loader.UserWriter;
import com.acme.etl.core.User;
import com.acme.etl.loader.UserWriterException;
import java.util.Collection;

/**
 * @author vm.andreev
 */
class UserWriterStub implements UserWriter  {

    private final String instance;

    public UserWriterStub(String instance) {
        this.instance = instance;
    }

    /**
     * Save users to storage
     *
     * @param users
     */
    @Override
    public void save(Collection<User> users) throws UserWriterException {
        for (User user : users) {
            if (user != null) {
                System.out.println("Saved: " + user + " to " + instance);
            }
        }
    }

}
