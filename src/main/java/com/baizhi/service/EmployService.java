package com.baizhi.service;

import com.baizhi.entity.Employ;

import java.util.List;

public interface EmployService {
    List<Employ> selectAllEmploy();

    int deleteByPrimaryKey(Integer id);

    Employ selectByPrimaryKey(Integer id);

    void updateByPrimaryKey(Employ record);

    void insert(Employ record);

}
