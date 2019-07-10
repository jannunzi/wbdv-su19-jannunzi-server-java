package com.example.wbdvsu19jannunziserverjava.controller;

import com.example.wbdvsu19jannunziserverjava.models.Lesson;
import com.example.wbdvsu19jannunziserverjava.repositories.LessonRepository;
import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class LessonController {
    @Autowired
    LessonRepository repository;
    @GetMapping("/api/modules/{mid}/lessons")
    public List<Lesson> findLessonsForModule(@PathVariable("mid") Integer mid) {
        return this.repository.findAllLessonsForModule(mid);
    }
}
