package com.example.wbdvsu19jannunziserverjava.repositories;

import com.example.wbdvsu19jannunziserverjava.models.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository
    extends CrudRepository<Course, Integer> {

    @Query("select course from Course course")
    public List<Course> findAllCourses();

    @Query("select course from Course course where course.id=:cid")
    public Course findCourseById(@Param("cid") Integer id);
}
