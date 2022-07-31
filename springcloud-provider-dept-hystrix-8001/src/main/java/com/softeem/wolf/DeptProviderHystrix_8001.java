package com.softeem.wolf;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * Created by 苍狼
 * Time on 2022-07-18
 */
@SpringBootApplication
@EnableEurekaClient     //在服务启动后,自动注册到Eureka注册中心中
@EnableDiscoveryClient  // 注册进来的微服务, 获取一些信息 服务发现, 扩展内容
@EnableCircuitBreaker   // 添加Hystrix服务熔断 断路器的支持
public class DeptProviderHystrix_8001 {

    public static void main(String[] args) {

        SpringApplication.run(DeptProviderHystrix_8001.class, args);

    }

    //增加一个servlet,配合dashboard监控使用，固定的代码 http://localhost:8001/actuator/hystrix.stream访问监控
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }
}
