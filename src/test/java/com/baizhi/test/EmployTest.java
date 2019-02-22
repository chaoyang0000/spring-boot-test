package com.baizhi.test;

import com.baizhi.entity.Employ;
import com.baizhi.service.EmployService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployTest extends UserTest {
    @Autowired
    private EmployService employService;

    @Test
    public void selectAllEmploy() {
        List<Employ> list = employService.selectAllEmploy();
        for (Employ employ : list) {
            System.out.println("!!!!!!" + employ);
        }
    }

}
