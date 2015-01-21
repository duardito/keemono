package com.keemono.web.init;

import com.keemono.common.CommonConfig;
import com.keemono.service.ServiceConfig;
import com.keemono.web.IntegrationConfig;
import com.keemono.web.WebConfiguration;
import com.keemono.web.filters.SimpleCORSFilter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Created by edu on 12/01/2015.
 */
public class WebInitContext extends
        AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
                return new Class<?>[]{WebConfiguration.class, IntegrationConfig.class, ServiceConfig.class, CommonConfig.class};
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
                return new Class<?>[0];
        }

        @Override
        protected Filter[] getServletFilters() {

                /*
                 OpenEntityManagerInViewFilter openEntityManagerInViewFilter = new OpenEntityManagerInViewFilter();
        openEntityManagerInViewFilter.setBeanName("openEntityManagerInViewFilter");
        openEntityManagerInViewFilter.setPersistenceUnitName("HSQL");

        return new javax.servlet.Filter[]{openEntityManagerInViewFilter};
                 */

                final SimpleCORSFilter simpleCORSFilter = new SimpleCORSFilter();
                //it is required to be name shirofilter, when spring scans all components will search a bean named shiroFilter
                final DelegatingFilterProxy securityFilterChain =
                        new DelegatingFilterProxy("shiroFilter");

                CharacterEncodingFilter characterEncodingFilter =
                        new CharacterEncodingFilter();
                characterEncodingFilter.setEncoding("UTF-8");
                characterEncodingFilter.setForceEncoding(true);

                return new Filter[] {securityFilterChain,simpleCORSFilter ,characterEncodingFilter };
        }

        @Override
        protected String[] getServletMappings() {
                return new String[] {"/" };
        }
}
