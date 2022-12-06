package com.example.CourseAppBackend.dao;

import com.example.CourseAppBackend.Model.Courses;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Courses,Integer> {
}
