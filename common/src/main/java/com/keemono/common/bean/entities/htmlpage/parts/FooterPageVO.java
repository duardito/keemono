package com.keemono.common.bean.entities.htmlpage.parts;

import com.keemono.common.bean.entities.generic.AbstractDocumentVO;

/**
 * Created by edu on 12/01/2015.
 */
public class FooterPageVO extends AbstractDocumentVO {

    private String footerContent;

    public String getFooterContent() {
        return footerContent;
    }

    public void setFooterContent(String footerContent) {
        this.footerContent = footerContent;
    }
}
