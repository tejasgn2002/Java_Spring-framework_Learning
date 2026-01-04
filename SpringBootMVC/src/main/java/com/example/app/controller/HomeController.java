package com.example.app.controller;

import com.example.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
	public String home(){
        System.out.println("Home Calculator");
        return "index.jsp";
    }
    @GetMapping("/add")
    public String add(@RequestParam int num1, @RequestParam int num2, Model model){
        System.out.println(num1 + num2);
        model.addAttribute("result",num1+num2);
        return "result.jsp";
    }

    @GetMapping("/addstudent1")
    public ModelAndView addStudent(@RequestParam String name,@RequestParam int age,ModelAndView mv){

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        mv.addObject("student",student);
        mv.setViewName("student.jsp");
        return mv;
    }

    @GetMapping("/addstudent")
    public String addStudentMv(@ModelAttribute Student student){
        System.out.println("at ModelAttribute");
        return "student.jsp";
    }
}
