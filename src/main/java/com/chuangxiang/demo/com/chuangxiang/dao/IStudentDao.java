package com.chuangxiang.demo.com.chuangxiang.dao;

import com.chuangxiang.demo.com.chuangxiang.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentDao {

    Student queryone(Integer id);

    List<Student> queryAll();
}