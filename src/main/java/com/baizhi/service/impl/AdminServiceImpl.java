package com.baizhi.service.impl;

import com.baizhi.dao.AdminMapper;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin selectByUsernameAndPassword(Admin admin) {
        Admin admin1 = adminMapper.selectByUsernameAndPassword(admin);
        return admin1;
    }

    @Override
    public int insert(Admin admin) {
        int a = adminMapper.insert(admin);
        return a;
    }
}
