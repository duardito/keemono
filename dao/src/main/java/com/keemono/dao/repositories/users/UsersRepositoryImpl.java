package com.keemono.dao.repositories.users;

import com.keemono.dao.entities.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * Created by edu on 12/01/2015.
 */
public class UsersRepositoryImpl implements UsersRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public User login(final User user) {
        final Query query = new Query();
        query.addCriteria(Criteria.where("password").is(user.getPassword()).and("username").is(user.getUsername()));
        return mongoTemplate.findOne(query, User.class);
    }
}