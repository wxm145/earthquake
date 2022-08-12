package com.earthquake.map;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(value = "com.earthquake.map.dao")
@SpringBootApplication
public class EarthquakeApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EarthquakeApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(EarthquakeApplication.class, args);
    }

}
