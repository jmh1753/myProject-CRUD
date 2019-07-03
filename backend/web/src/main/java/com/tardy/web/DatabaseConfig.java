package com.tardy.web;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * DatabaseConfig
 */
@Configuration
public class DatabaseConfig {
    @Bean
    public ServletRegistrationBean h2RegistrationBean(){
        ServletRegistrationBean registration = new ServletRegistrationBean<>(new WebServlet());
        registration.addUrlMappings("/console/*");
        return registration;
    }
    
}