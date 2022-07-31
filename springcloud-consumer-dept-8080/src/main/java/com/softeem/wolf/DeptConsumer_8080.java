package com.softeem.wolf;

import com.softeem.Myrule.DiyRandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created by 苍狼
 * Time on 2022-07-18
 */
@SpringBootApplication
@EnableEurekaClient // 在服务启动后, 自己注册到eureka注册中心中去.
//在微服务启动的时候就能去加载我们自定义Ribbon配置的负载均衡类，自定义为跳转5次切换节点
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = DiyRandomRule.class)
public class DeptConsumer_8080 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_8080.class, args);
    }
}
