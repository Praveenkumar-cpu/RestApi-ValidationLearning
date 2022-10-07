package com.bridglelab.restapilearning.service;

import com.bridglelab.restapilearning.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;
    public CourseServiceImpl(){

        list = new ArrayList<>();
        list.add(new Course(145,"spring boot","learning spring boot"));
        list.add(new Course(245,"microservices","learning microservice boot"));

    }
    @Override
    public List<Course> getCourses() {
        return null;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for (Course course : list)
        {
            if (course.getId()==courseId)
            {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
