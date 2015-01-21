package com.keemono.dao.entities.htmlpage.parts;

import com.keemono.dao.entities.generic.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by edu on 12/01/2015.
 */
@Document(collection="footer")
public class FooterPage extends AbstractDocument {

    private String footerContent;

    public String getFooterContent() {
        return footerContent;
    }

    public void setFooterContent(String footerContent) {
        this.footerContent = footerContent;
    }
}
