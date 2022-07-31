package com.softeem.wolf.service;

import com.softeem.wolf.entity.Dept;

import java.util.List;

/**
 * Created by 苍狼
 * Time on 2022-07-18
 */
public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
