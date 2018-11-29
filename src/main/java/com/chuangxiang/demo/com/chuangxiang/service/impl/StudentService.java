package com.chuangxiang.demo.com.chuangxiang.service.impl;

import com.chuangxiang.demo.com.chuangxiang.dao.IStudentDao;
import com.chuangxiang.demo.com.chuangxiang.entity.Student;
import com.chuangxiang.demo.com.chuangxiang.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentDao studentDao;

    @Override
    public Student queryone(Integer id) {
        return studentDao.queryone(id);
    }

    @Override
    public List<Student> queryAll() {
        return studentDao.queryAll();
    }
}
