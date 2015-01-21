package com.keemono.dao.entities.htmlpage.parts;

import com.keemono.dao.entities.generic.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by edu on 12/01/2015.
 */
@Document(collection="right")
public class RightPart extends AbstractDocument {

    private String rightContent;

    public String getRightContent() {
        return rightContent;
    }

    public void setRightContent(String rightContent) {
        this.rightContent = rightContent;
    }
}
