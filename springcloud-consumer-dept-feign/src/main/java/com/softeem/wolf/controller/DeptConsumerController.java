package com.softeem.wolf.controller;

import com.softeem.wolf.entity.Dept;
import com.softeem.wolf.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 苍狼
 * Time on 2022-07-24
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService = null;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.queryById(id);
    }

    //查询所有信息
    @RequestMapping("/consumer/dept/list")
    public List<Dept> queryAll(){
        return deptClientService.queryAll();
    }
}