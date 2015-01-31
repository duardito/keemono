package com.keemono.dao;

import com.keemono.core.config.MongoConnection;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by edu on 12/01/2015.
 */
@EnableMongoRepositories(basePackages = "com.keemono.dao.repositories")
@ComponentScan
@Import({MongoConnection.class})
@Configuration
public interface DaoConfiguration {
}
