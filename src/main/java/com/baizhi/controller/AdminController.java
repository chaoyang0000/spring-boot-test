package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("login")
    public String login(Admin admin, Map map) {

        Admin admin1 = adminService.selectByUsernameAndPassword(admin);
        if (admin1 != null) {
            return "redirect:/employ/selectAllEmploy";
        } else {
            System.out.println("我是傻逼");
            String error = "账号或密码错误";
            map.put("error", error);
            return "login";
        }
    }

    @RequestMapping("register")
    public String register(Admin admin, String kaptcha, HttpSession httpSession, Map map) {
        String kaptcha1 = (String) httpSession.getAttribute("kaptcha");
        if (kaptcha1.equalsIgnoreCase(kaptcha)) {
            int key = adminService.insert(admin);
            if (key == 1) {
                String success = "注册成功请登录";
                map.put("success", success);
                return "login";
            } else {
                String error = "注册失败请重新注册";
                map.put("error", error);
                return "regist";
            }
        } else {
            String error = "验证码输入错误";
            map.put("error", error);
            return "regist";
        }

    }


}
