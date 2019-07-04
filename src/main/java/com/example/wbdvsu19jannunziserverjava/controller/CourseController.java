package com.example.wbdvsu19jannunziserverjava.controller;

import com.example.wbdvsu19jannunziserverjava.models.Course;
import com.example.wbdvsu19jannunziserverjava.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CourseController {

    @Autowired
    CourseRepository repository;

    // CRUD
    // CREATE   - POST /api/courses
    // READ ALL - GET  /api/courses - retrieve all courses
    // READ ONE - GET  /api/courses/{cid} - retrieve by id
    // UPDATE   - PUT  /api/courses/{cid} - update course
    // DELETE   - DELETE /api/courses/{cid}

    @GetMapping("/api/courses")
    public List<Course> findAllCourses() {
        return repository.findAllCourses();
    }

    @GetMapping("/api/courses/{cid}")
    public Course findCourseById(
            @PathVariable("cid") Integer id) {
        return repository.findCourseById(id);
    }
}
