package com.baizhi.service;

import com.baizhi.entity.Admin;

public interface AdminService {
    Admin selectByUsernameAndPassword(Admin admin);

    int insert(Admin admin);
}
