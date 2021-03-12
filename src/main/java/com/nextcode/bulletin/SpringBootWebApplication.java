package com.nextcode.bulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.jdbc.core.JdbcTemplate;

//import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWebApplication.class) ;
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootWebApplication.class, args);

    }


}
