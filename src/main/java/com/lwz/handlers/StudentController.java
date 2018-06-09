package com.lwz.handlers;


import com.lwz.beans.Student;
import com.lwz.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class StudentController {

    @Autowired
    private IStudentService service;

    public void setService(IStudentService service) {
        this.service = service;
    }

    @RequestMapping("/register")
    public String doRegister(String name, int age, HttpServletRequest request) {
        Student student = new Student(name, age);
        service.addStudent(student);
        request.setAttribute("stuName", name);
        return "/wellcome.jsp";
    }
}
