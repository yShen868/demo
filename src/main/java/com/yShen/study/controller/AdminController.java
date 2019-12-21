package com.yShen.study.controller;


import com.yShen.study.model.Admin;
import com.yShen.study.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping("select")
    public List<Admin> select(){
        List<Admin> select = adminService.select();

        return select;
    }
}
