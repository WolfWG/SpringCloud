package com.softeem.wolf.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.softeem.wolf.dao.DeptDao;
import com.softeem.wolf.entity.Dept;
import com.softeem.wolf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 苍狼
 * Time on 2022-07-18
 */
//提供restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptDao deptDao;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptDao.queryById(id);

        if (dept == null) {
            throw new RuntimeException("id=> \"+ id+\"不存在该用户,或者该信息无法找到");
        }
        return dept;
    }

    //如果出现异常, 采用hystrix的备选方案
    public Dept hystrixGet(@PathVariable("id") Long id){

        return new Dept()
                .setDeptno(id)
                .setDname("id=> \"+id+\"没有找到相关信息,null by Hystrix")
                .setDb_source("not found database in mysql");

    }


//    @Autowired
//    private DeptService deptService;
//
//    @PostMapping("/dept/add")
//    public boolean addDept(Dept dept){
//        return deptService.addDept(dept);
//    }
//
//    @GetMapping("/dept/get/{id}")
//    public Dept queryById(@PathVariable("id") Long id){
//        return deptService.queryById(id);
//    }
//
//    @RequestMapping("/dept/list")
//    public List<Dept> queryAll(){
//        return deptService.queryAll();
//    }
//
//    //获取一些配置信息, 得到具体的微服务
//    @Autowired
//    private DiscoveryClient client;
//
//    //注册进行的微服务, 获取一些信息, 没有实际作用
//    @RequestMapping("/dept/discovery")
//    public Object discovery(){
//        //获取微服务列表的清单
//        List<String> services = client.getServices();
//        System.out.println("discovery--->services"+services);
//
//        //得到一个具体的微服务信息, 通过具体的微服务id, 7001中的applicationName
//        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
//        for (ServiceInstance instance : instances) {
//
//            System.out.println(
//                    instance.getHost()+"\t\t\t"+
//                    instance.getPort()+"\t\t\t"+
//                    instance.getUri()+"\t\t\t"+
//                    instance.getServiceId());
//        }
//        return this.client;
//    }
}
