package com.keemono.dao.entities.htmlpage.parts;

import com.keemono.dao.entities.generic.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by edu on 12/01/2015.
 */
@Document(collection="header")
public class HeaderPage extends AbstractDocument {

    private String headerContent;

    public String getHeaderContent() {
        return headerContent;
    }

    public void setHeaderContent(String headerContent) {
        this.headerContent = headerContent;
    }
}
