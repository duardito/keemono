package com.keemono.dao.repositories.htmlpages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by edu on 12/01/2015.
 */
public class HtmlPageRepositoryImpl implements HtmlPageRepositoryCustom{

    @Autowired
    private MongoTemplate mongoTemplate;
}
