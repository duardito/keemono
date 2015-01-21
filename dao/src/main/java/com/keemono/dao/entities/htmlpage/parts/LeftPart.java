package com.keemono.dao.entities.htmlpage.parts;

import com.keemono.dao.entities.generic.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by edu on 12/01/2015.
 */
@Document(collection="left")
public class LeftPart extends AbstractDocument {

    private String leftContent;

    public String getLeftContent() {
        return leftContent;
    }

    public void setLeftContent(String leftContent) {
        this.leftContent = leftContent;
    }
}
