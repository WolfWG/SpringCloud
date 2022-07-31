package com.softeem.wolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by 苍狼
 * Time on 2022-07-24
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.softeem.wolf"})
public class DeptConsumer_feign {

    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer_feign.class, args);

    }

}
