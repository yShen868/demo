package com.yShen.study.service.impl;

import com.yShen.study.mapper.AdminMapper;
import com.yShen.study.model.Admin;
import com.yShen.study.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author 郑悦恺
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> select() {
        return adminMapper.selectAll();
    }
}
