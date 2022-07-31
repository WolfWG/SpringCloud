package com.softeem.wolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by 苍狼
 * Time on 2022-07-29
 */
@SpringBootApplication
@EnableConfigServer  // 开启配置服务
public class Config_Server_3344 {

    public static void main(String[] args) {
        SpringApplication.run(Config_Server_3344.class, args);
    }
}
