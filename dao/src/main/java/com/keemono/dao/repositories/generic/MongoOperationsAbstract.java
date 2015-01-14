package com.keemono.dao.repositories.generic;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by edu on 12/01/2015.
 */
@NoRepositoryBean
public interface MongoOperationsAbstract  <M, S extends Serializable> extends MongoRepository<M, S> {
}
