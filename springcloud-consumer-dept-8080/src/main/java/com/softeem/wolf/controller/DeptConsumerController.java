package com.softeem.wolf.controller;

import com.softeem.wolf.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by 苍狼
 * Time on 2022-07-18
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

//    private static final String rest_url_prefix = "http://localhost:8001";

    private static final String rest_url_prefix = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(rest_url_prefix+"/dept/add", dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(rest_url_prefix+"/dept/get/"+id, Dept.class);
    }

    @RequestMapping("consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(rest_url_prefix+"/dept/list",List.class);
    }
}
