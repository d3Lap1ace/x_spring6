package org.springMvc.response.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/24/2024 10:31 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Configuration
@ComponentScan("org.springMvc.response.json")
@EnableWebMvc
public class Mvcconfig implements WebMvcConfigurer {
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/",".jsp");
    }
}
