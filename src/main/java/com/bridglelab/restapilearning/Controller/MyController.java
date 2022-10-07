package com.bridglelab.restapilearning.Controller;
import com.bridglelab.restapilearning.entities.Course;
import com.bridglelab.restapilearning.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
public class MyController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "This is home page welcome";
    }

    // here we getting all the courses
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return this.courseService.getCourses();
    }

    // here  we getting single course using id
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    // here we adding course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){

        return this.courseService.addCourse(course);
    }


}
