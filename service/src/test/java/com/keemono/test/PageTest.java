package com.keemono.test;

import com.keemono.dao.entities.htmlpage.HtmlPage;
import com.keemono.dao.entities.htmlpage.parts.BodyPage;
import com.keemono.dao.repositories.htmlpages.HtmlPageRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by edu on 21/01/2015.
 */
public class PageTest extends AbstractIntegrationTest{

    @Autowired
    HtmlPageRepository htmlPageRepository;

    @Test
    public void pageTest(){
        String id = "home";

        HtmlPage htmlPage = new HtmlPage();
        htmlPage.setId(id);
        htmlPage.setName(id);
        BodyPage bodyPage = new BodyPage();
        bodyPage.setId(id);
        bodyPage.setBodyContent("<div><table class=\"sir\" draggable=\"true\" id=\"lalala\"><tr><td>td primero</td></tr><tr><td>debajo del titulo</td></tr> </table></div>");
        htmlPage.setBodyPage(bodyPage);
        htmlPageRepository.save(htmlPage);
    }
}
