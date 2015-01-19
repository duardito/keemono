package com.keemono.common.bean.entities.htmlpage.parts;

import com.keemono.common.bean.entities.generic.AbstractDocumentVO;

/**
 * Created by edu on 12/01/2015.
 */
public class BodyPageVO extends AbstractDocumentVO {

    private String bodyContent;

    public String getBodyContent() {
        return bodyContent;
    }

    public void setBodyContent(String bodyContent) {
        this.bodyContent = bodyContent;
    }
}
