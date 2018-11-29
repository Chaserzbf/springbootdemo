package com.chuangxiang.demo.com.chuangxiang.service;

import com.chuangxiang.demo.com.chuangxiang.entity.Student;

import java.util.List;

public interface IStudentService {

    Student queryone(Integer id);

    List<Student> queryAll();

}
