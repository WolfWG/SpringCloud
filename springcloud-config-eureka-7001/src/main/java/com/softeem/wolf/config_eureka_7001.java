package com.softeem.wolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 苍狼
 * Time on 2022-07-29
 */

@SpringBootApplication
@EnableEurekaServer
public class config_eureka_7001 {

    public static void main(String[] args) {
        SpringApplication.run(config_eureka_7001.class, args);
    }
}
