package com.keemono.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by edu on 12/01/2015.
 */
@EnableTransactionManagement
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.keemono.web", useDefaultFilters = false, includeFilters = {@ComponentScan.Filter(RestController.class),@ComponentScan.Filter(Controller.class)})
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    public void configureDefaultServletHandling(
            final DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
