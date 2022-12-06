package com.example.CourseAppBackend.Controller;

import com.example.CourseAppBackend.Model.Courses;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @GetMapping("/")
    public String Welcomepage(){
        return "Welcome to course app";
    }

    @PostMapping(path ="/add" ,consumes = "application/json",produces = "application/json")
    public String addCourse(@RequestBody Courses c){
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDate().toString());
        return "Course Added Successfully";
    }

    @PostMapping("/view")
    public String  ViewCourse(){
        return "View all Courses";
    }
}
