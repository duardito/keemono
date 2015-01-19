package com.keemono.common.bean.entities.htmlpage;

import com.keemono.common.bean.entities.generic.AbstractDocumentVO;
import com.keemono.common.bean.entities.htmlpage.parts.*;

/**
 * this object is html page representation,
 * it will include all possible parts of a html page
 * Created by edu on 12/01/2015.
 */
public class HtmlPageVO extends AbstractDocumentVO {

    private BodyPageVO bodyPage;

    private FooterPageVO footerPage;

    private HeaderPageVO headerPage;

    private RightPartVO rightPart;

    private LeftPartVO leftPart;

    public BodyPageVO getBodyPage() {
        return bodyPage;
    }

    public void setBodyPage(BodyPageVO bodyPage) {
        this.bodyPage = bodyPage;
    }

    public FooterPageVO getFooterPage() {
        return footerPage;
    }

    public void setFooterPage(FooterPageVO footerPage) {
        this.footerPage = footerPage;
    }

    public HeaderPageVO getHeaderPage() {
        return headerPage;
    }

    public void setHeaderPage(HeaderPageVO headerPage) {
        this.headerPage = headerPage;
    }

    public RightPartVO getRightPart() {
        return rightPart;
    }

    public void setRightPart(RightPartVO rightPart) {
        this.rightPart = rightPart;
    }

    public LeftPartVO getLeftPart() {
        return leftPart;
    }

    public void setLeftPart(LeftPartVO leftPart) {
        this.leftPart = leftPart;
    }
}
