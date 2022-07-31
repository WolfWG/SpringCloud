package com.softeem.wolf.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 苍狼
 * Time on 2022-07-18
 */
@Configuration
public class ConfigBean {  //相当于Spring中的application.xml

    @LoadBalanced
    @Bean  //这个就相当于在application.xml中创建bean
    public RestTemplate getRestTemplate(){

        return new RestTemplate();

    }

}
