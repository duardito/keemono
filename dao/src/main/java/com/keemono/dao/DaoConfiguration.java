package com.keemono.dao;

import com.keemono.core.config.MongoConnection;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

/**
 * Created by edu on 12/01/2015.
 */
@ComponentScan
@Profile("mongodb")
@Import({MongoConnection.class})
@Configuration
public interface DaoConfiguration {
}
