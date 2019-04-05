package com.api.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class ApiApplication extends SpringBootServletInitializer {
    private static final java.util.logging.Logger logger = Logger.getLogger(ApiApplication.class.getCanonicalName());

    public static void main( String[] args ) {
        SpringApplication.run( ApiApplication.class, args );
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder ) {
        return builder.sources( ApiApplication.class );
    }

}
