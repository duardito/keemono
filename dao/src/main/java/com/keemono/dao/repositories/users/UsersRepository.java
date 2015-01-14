package com.keemono.dao.repositories.users;

import com.keemono.dao.entities.users.User;
import com.keemono.dao.repositories.generic.MongoOperationsAbstract;

/**
 * Created by edu on 12/01/2015.
 */
public interface UsersRepository extends MongoOperationsAbstract<User, String>, UsersRepositoryCustom<User, String> {
}

