package com.keemono.common.bean.entities.htmlpage.parts;

import com.keemono.common.bean.entities.generic.AbstractDocumentVO;

/**
 * Created by edu on 12/01/2015.
 */
public class HeaderPageVO extends AbstractDocumentVO {

    private String headerContent;

    public String getHeaderContent() {
        return headerContent;
    }

    public void setHeaderContent(String headerContent) {
        this.headerContent = headerContent;
    }
}
