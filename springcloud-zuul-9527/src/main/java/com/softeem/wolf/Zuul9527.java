package com.softeem.wolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by 苍狼
 * Time on 2022-07-26
 */
@SpringBootApplication
@EnableEurekaClient     //在服务启动后,自动注册到Eureka注册中心中
@EnableDiscoveryClient  // 注册进来的微服务, 获取一些信息 服务发现, 扩展内容
@EnableZuulProxy
public class Zuul9527 {

    public static void main(String[] args) {

        SpringApplication.run(Zuul9527.class, args);

    }
}
