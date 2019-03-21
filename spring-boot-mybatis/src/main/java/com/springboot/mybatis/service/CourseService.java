package com.springboot.mybatis.service;


import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.CourseVO;

import java.util.List;

public interface CourseService {
   List<CourseVO> selectAll();

   List<CourseVO> selectAll1();

   Course getOne(Long courseId);

   void delete(Long courseId);

   Course insert(Course course);

   void update(Course course);
}
