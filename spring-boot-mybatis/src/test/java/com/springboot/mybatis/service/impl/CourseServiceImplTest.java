package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.service.CourseService;
import com.springboot.mybatis.util.RandomUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.RandomAccess;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CourseServiceImplTest {
    @Resource
    private CourseService courseService;

    @Test
    public void selectAll() {
        List<Course> courseList=courseService.selectAll();
        courseList.forEach(course -> System.out.println(course));
    }
    @Test
    public void getOne(){
        Course course=courseService.getOne(4L);
        System.out.println(course);
    }

    @Test
    public void delete(){

        courseService.delete(3L);
    }

    @Test
    public void insert(){
        Course course = new Course();
        course.setCourseName("微信");
        course.setCourseClass("软件1721");
        course.setUserId(2L);
        course.setCover("2.jpg");
        course.setCourseCode(RandomUtil.getRandomCode());
        course.setFinished((short)0);
        courseService.insert(course);
    }

    @Test
    public void update(){
        Course course = courseService.getOne(8L);
        course.setCover("9876543.jpg");
        course.setFinished((short)1);
        courseService.update(course);
    }
}
