package com.softeem.wolf.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by 苍狼
 * Time on 2022-07-17
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)  //链式写法
public class Dept implements Serializable {

    private static final long serialVersionUID = -2144303170121682010L;

    //orm
    private Long deptno;
    private String dname;

    //这个数据存在那个数据库的字段 : 一个服务对应一个数据库, 同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }

    /**
     * 链式写法:
     * Dept dept = new Dept();
     * dept.setDepNo(11).setDname("ssss").setDb_source("001")
     */
}
