package com.andy.springbootcasclient.controller;

import com.andy.springbootcasclient.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: andy
 * Date: 2019/7/31
 * Time: 15:13
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student/{id}")
    public String selectUser (@PathVariable String id){
        return studentService.selectStudentById(id).toString();

    }
}
