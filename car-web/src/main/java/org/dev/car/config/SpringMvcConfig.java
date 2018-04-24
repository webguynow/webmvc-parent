package org.dev.car.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "org.dev.car.controller" })
public class SpringMvcConfig {

	
    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver beanVR = new InternalResourceViewResolver();
        beanVR.setPrefix("/WEB-INF/views/");
        beanVR.setSuffix(".jsp");
        return beanVR;
    }

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver getMultipartResolver() {
        // return new CommonsMultipartResolver();
    	
        CommonsMultipartResolver resolver=new CommonsMultipartResolver();
        resolver.setDefaultEncoding("utf-8");
        return resolver;
        
    }

    @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource getMessageSource() {
        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
        resource.setBasename("classpath:messages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }

}