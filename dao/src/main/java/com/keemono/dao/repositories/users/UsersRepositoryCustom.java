package com.keemono.dao.repositories.users;

import com.keemono.dao.entities.users.User;

import java.io.Serializable;

/**
 * Created by edu on 12/01/2015.
 */
public interface UsersRepositoryCustom <M, S extends Serializable>{

    public M findByUser(User user);
}

