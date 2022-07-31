package com.softeem.wolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 苍狼
 * Time on 2022-07-18
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //注册进来的微服务, 获取一些信息 服务发现, 扩展内容
public class DeptProvider_8002 {

    public static void main(String[] args) {

        SpringApplication.run(DeptProvider_8002.class, args);

    }
}
