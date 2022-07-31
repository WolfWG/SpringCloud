package com.softeem.Myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 苍狼
 * Time on 2022-07-23
 */
@Configuration
public class RuleConfig {


    @Bean
    public IRule myRule(){

        return new DiyRandomRule();

    }

}
