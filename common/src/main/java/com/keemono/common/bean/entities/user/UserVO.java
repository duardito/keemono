package com.keemono.common.bean.entities.user;

import com.keemono.common.bean.entities.generic.AbstractDocumentVO;

/**
 * Created by edu on 27/01/2015.
 */
public class UserVO extends AbstractDocumentVO {

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
