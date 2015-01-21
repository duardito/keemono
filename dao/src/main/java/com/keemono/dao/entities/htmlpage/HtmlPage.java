package com.keemono.dao.entities.htmlpage;

import com.keemono.dao.entities.generic.AbstractDocument;
import com.keemono.dao.entities.htmlpage.parts.*;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * this object is html page representation,
 * it will include all possible parts of a html page
 * Created by edu on 12/01/2015.
 */
@Document(collection="htmlpages")
public class HtmlPage extends AbstractDocument{


    private BodyPage bodyPage;


    private FooterPage footerPage;


    private HeaderPage headerPage;


    private RightPart rightPart;


    private LeftPart leftPart;

    public BodyPage getBodyPage() {
        return bodyPage;
    }

    public void setBodyPage(BodyPage bodyPage) {
        this.bodyPage = bodyPage;
    }

    public FooterPage getFooterPage() {
        return footerPage;
    }

    public void setFooterPage(FooterPage footerPage) {
        this.footerPage = footerPage;
    }

    public HeaderPage getHeaderPage() {
        return headerPage;
    }

    public void setHeaderPage(HeaderPage headerPage) {
        this.headerPage = headerPage;
    }

    public RightPart getRightPart() {
        return rightPart;
    }

    public void setRightPart(RightPart rightPart) {
        this.rightPart = rightPart;
    }

    public LeftPart getLeftPart() {
        return leftPart;
    }

    public void setLeftPart(LeftPart leftPart) {
        this.leftPart = leftPart;
    }
}
