package com.baizhi.service.impl;

import com.baizhi.dao.EmployMapper;
import com.baizhi.entity.Employ;
import com.baizhi.service.EmployService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class EmployServiceImpl implements EmployService {
    @Resource
    private EmployMapper employMapper;

    @Override
    public List<Employ> selectAllEmploy() {
        List<Employ> list = employMapper.selectAllEmploy();
        return list;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int a = employMapper.deleteByPrimaryKey(id);
        return a;
    }

    @Override
    public Employ selectByPrimaryKey(Integer id) {
        Employ employ = employMapper.selectByPrimaryKey(id);
        return employ;
    }

    @Override
    public void updateByPrimaryKey(Employ record) {
        employMapper.updateByPrimaryKey(record);
    }

    @Override
    public void insert(Employ record) {
        employMapper.insert(record);
    }
}
