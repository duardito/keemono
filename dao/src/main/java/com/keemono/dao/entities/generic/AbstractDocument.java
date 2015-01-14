package com.keemono.dao.entities.generic;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * generic document for all the rest of the documents, it will contain generic fields
 * Created by edu on 12/01/2015.
 */
public class AbstractDocument implements Serializable{

    @Id
    private String id;

    @Field
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
