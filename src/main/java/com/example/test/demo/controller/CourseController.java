package com.example.test.demo.controller;


import com.example.test.demo.model.Course;
import com.example.test.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/courses")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Course> createCourse(@RequestBody Course course)
    {
        return courseService.createCourse(course);
    }


    @GetMapping("/course/{courseId}")
    @ResponseStatus(HttpStatus.FOUND)
    public Mono<Course> getCourse(@PathVariable Long courseId)
    {
        return courseService.findCourse(courseId);
    }

}
