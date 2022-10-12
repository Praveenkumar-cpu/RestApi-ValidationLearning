package com.bridglelab.restapilearning.service;

import com.bridglelab.restapilearning.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);


    }



