package com.geological.classes.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.geological.data.access.entity"})
//@ComponentScan({"com.geological.classes.core.entity"})
//@EnableJpaRepositories(basePackages = {"am.hovall.common.repository"})
@SpringBootApplication
public class GeologicalClassesRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeologicalClassesRestApplication.class, args);
    }

}
