package com.keemono.dao.entities.users;

import com.keemono.dao.entities.generic.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by edu on 12/01/2015.
 */
@Document(collection="users")
public class User extends AbstractDocument {

    private String password;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
