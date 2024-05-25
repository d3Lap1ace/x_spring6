package org.springMvc.response.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/24/2024 10:35 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class SpringMvcClnit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{Mvcconfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
