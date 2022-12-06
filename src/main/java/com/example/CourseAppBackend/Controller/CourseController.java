package com.example.CourseAppBackend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/")
    public String Welcomepage(){
        return "Welcome to course app";
    }
}
