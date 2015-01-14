package com.keemono.core.servlet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edu on 12/01/2015.
 */
@RestController
public class AbstractServlet {

    @RequestMapping(value = "/show", method = RequestMethod.GET, produces={"text/html"})
    public String show()  {
        return "<html><head><title>hole</title></head><body><h1>ssssssss</h1></body></html>";
    }
}
