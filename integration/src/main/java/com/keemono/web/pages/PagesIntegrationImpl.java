package com.keemono.web.pages;

import com.keemono.common.bean.entities.htmlpage.HtmlPageVO;
import com.keemono.service.pages.PagesServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * by default all servlets will be anotated with @Controller instead @RestController ,
 * to avoid all methods return something.
 * Created by edu on 15/01/2015.
 */
@Controller
public class PagesIntegrationImpl implements PagesIntregationI{

    @Autowired
    PagesServiceI pagesServiceI;

    //TODO : still required to add validation to requestbody
    @RequestMapping(value = "/page/save", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @Override
    public void save(@RequestBody HtmlPageVO htmlPageVO) {
        pagesServiceI.save(htmlPageVO);
    }

    @RequestMapping(value = "/page/findAll", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    @Override
    public List<HtmlPageVO> findAll() {
        return pagesServiceI.findAll();
    }

    @RequestMapping(value = "/page/findByName/{name}", method = RequestMethod.GET, produces={"text/html"})
    @Override
    public HtmlPageVO findByName(@PathVariable String name) {
        return pagesServiceI.findByName(name);
    }
}
