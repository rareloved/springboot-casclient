package com.andy.springbootcasclient.service;

import com.andy.springbootcasclient.domain.Student;
import com.andy.springbootcasclient.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: andy
 * Date: 2019/7/31
 * Time: 15:10
 */
@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;
    public Student selectStudentById(String id){
        return studentMapper.selectStudentById(id);
    }
}
