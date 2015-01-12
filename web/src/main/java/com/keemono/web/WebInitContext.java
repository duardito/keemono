package com.keemono.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by edu on 12/01/2015.
 */
public class WebInitContext extends
        AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
                return new Class<?>[0];
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
                return new Class<?>[0];
        }

        @Override
        protected String[] getServletMappings() {
                return new String[0];
        }
}
