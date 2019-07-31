package com.andy.springbootcasclient.mapper;

import com.andy.springbootcasclient.domain.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * User: andy
 * Date: 2019/7/31
 * Time: 15:08
 */
@Repository
public interface StudentMapper {

    @Select("select * from student where id =#{id}")
    Student selectStudentById(String id);
}
