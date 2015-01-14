package com.keemono.dao.repositories.htmlpages;

import com.keemono.dao.entities.htmlpage.HtmlPage;
import com.keemono.dao.repositories.generic.MongoOperationsAbstract;

/**
 * Created by edu on 12/01/2015.
 */
public interface HtmlPageRepository extends MongoOperationsAbstract<HtmlPage, String>, HtmlPageRepositoryCustom<HtmlPage, String> {

}
