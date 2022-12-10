package com.example.CourseAppBackend.dao;

import com.example.CourseAppBackend.Model.Courses;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Courses,Integer> {

    @Query(value = "SELECT `id`, `course_title`, `date`, `description`, `duration`, `venue` FROM `courses` WHERE `course_title`=:courseTitle",nativeQuery = true)
    List<Courses> SearchCourse(@Param("courseTitle") String courseTitle);
}
