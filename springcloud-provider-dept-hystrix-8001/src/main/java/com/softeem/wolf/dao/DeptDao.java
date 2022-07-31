package com.softeem.wolf.dao;

import com.softeem.wolf.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 苍狼
 * Time on 2022-07-18
 */
@Mapper
public interface DeptDao {
    //添加一个部门
    public boolean addDept(Dept dept);

    //根据id查出一个部门
    public Dept queryById(Long id);

    //查询所有部门信息
    public List<Dept> queryAll();

}
