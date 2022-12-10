package com.example.CourseAppBackend.Controller;

import com.example.CourseAppBackend.Model.Courses;
import com.example.CourseAppBackend.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Welcomepage() {
        return "Welcome to course app";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String addCourse(@RequestBody Courses c) {
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDate().toString());

        dao.save(c);
        return "Course Added Successfully";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")

    public List<Courses> SearchCourse(@RequestBody Courses c) {
        String courseTitle=String.valueOf(c.getCourseTitle());
        System.out.println(courseTitle);
        return(List<Courses>) dao.SearchCourse(c.getCourseTitle());

    }


    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Courses>  ViewCourse(){
        return (List<Courses>) dao.findAll();
    }
}
