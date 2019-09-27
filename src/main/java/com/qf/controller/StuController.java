package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {
    @Autowired
    private IStuService stuService;
    //学生列表
    @RequestMapping("/list")
    public String list(Model model){
        List<Student> studentList=stuService.list();
        model.addAttribute("studentList",studentList);
      return "stulist";
    }
    //根据id删除学生
    @RequestMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        stuService.removeById("id");
        return "redirect:/stu/list";
    }
}
