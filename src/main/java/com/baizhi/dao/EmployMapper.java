package com.baizhi.dao;

import com.baizhi.entity.Employ;

import java.util.List;

public interface EmployMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employ record);

    int insertSelective(Employ record);

    Employ selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employ record);

    int updateByPrimaryKey(Employ record);

    List<Employ> selectAllEmploy();
}