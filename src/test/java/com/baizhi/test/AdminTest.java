package com.baizhi.test;

import com.baizhi.dao.AdminMapper;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class AdminTest extends UserTest {
    @Autowired
    private AdminService adminService;
    @Resource
    private AdminMapper adminMapper;

    @Test
    public void login() {
        Admin admin = new Admin();
        admin.setUsername("小红");
        admin.setPassword("123123");
        Admin admin1 = adminService.selectByUsernameAndPassword(admin);
        System.out.println("***" + admin1);
    }

    @Test
    public void register() {
        Admin admin = new Admin();
        admin.setUsername("狼人");
        admin.setPassword("123123");
        admin.setSex(1);
        adminMapper.insert(admin);


    }
}
