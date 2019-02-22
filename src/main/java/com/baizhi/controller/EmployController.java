package com.baizhi.controller;

import com.baizhi.entity.Employ;
import com.baizhi.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/employ")
public class EmployController {
    @Autowired
    private EmployService employService;

    @RequestMapping("selectAllEmploy")
    public String selectAllEmploy(Map map) {
        List<Employ> list = employService.selectAllEmploy();
        map.put("list", list);
        return "emplist";
    }

    @RequestMapping("deleteByPrimaryKey")
    public String deleteByPrimaryKey(Integer id) {
        try {
            employService.deleteByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/employ/selectAllEmploy";
    }

    @RequestMapping("selectByPrimaryKey")
    public String selectByPrimaryKey(Integer id, Map map) {
        try {
            Employ employ = employService.selectByPrimaryKey(id);
            map.put("employ", employ);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "updateEmp";
    }

    @RequestMapping("updateByPrimaryKey")
    public String updateByPrimaryKey(Employ employ) {
        try {
            employService.updateByPrimaryKey(employ);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/employ/selectAllEmploy";
    }

    @RequestMapping("insert")
    public String insert(Employ employ) {
        try {
            employService.insert(employ);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/employ/selectAllEmploy";
    }
}
