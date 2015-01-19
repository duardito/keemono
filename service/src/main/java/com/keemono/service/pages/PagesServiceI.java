package com.keemono.service.pages;

import com.keemono.common.bean.entities.htmlpage.HtmlPageVO;

import java.util.List;

/**
 * Created by edu on 15/01/2015.
 */
public interface PagesServiceI {

    public void save(HtmlPageVO htmlPageVO);
    public List <HtmlPageVO>findAll();
}
