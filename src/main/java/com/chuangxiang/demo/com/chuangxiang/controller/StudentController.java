package com.chuangxiang.demo.com.chuangxiang.controller;

import com.chuangxiang.demo.com.chuangxiang.entity.Riqi;
import com.chuangxiang.demo.com.chuangxiang.entity.Student;
import com.chuangxiang.demo.com.chuangxiang.service.IStudentService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/StudentController")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @RequestMapping(value = "/ajax")
    public String ajax(){
        return "ajax";
    }

    @RequestMapping(value = "/queryone")
    @ResponseBody
    public String queryone(Integer id){
        Student student = studentService.queryone(id);
        Gson gson=new Gson();
        String s = gson.toJson(student);
        return s;
    }

    @RequestMapping(value = "/riqi")
    public String riqi(Riqi date, Model model){
        model.addAttribute("riqi",date);
        return "riqi";
    }

    @RequestMapping(value = "/queryAll")
    public String queryAll(Model model){
        List<Student> students = studentService.queryAll();
        model.addAttribute("list",students);
        return "studentList";
    }
}