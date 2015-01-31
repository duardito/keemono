package com.keemono.web;

import com.keemono.core.config.PropertyLoader;
import com.keemono.dao.DaoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by edu on 12/01/2015.
 */
@EnableMongoRepositories(basePackageClasses = {DaoConfiguration.class})
@PropertySource("classpath:config/mongo.properties")
@ComponentScan(basePackages = {
        "com.keemono",
        "com.keemono.web",} )
@Import({PropertyLoader.class,})
@Configuration
public interface WebConfiguration {
}
