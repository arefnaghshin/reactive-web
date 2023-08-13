package com.example.test.demo.service;

import com.example.test.demo.model.Course;
import com.example.test.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Mono<Course> createCourse(Course course)
    {
        return courseRepository.save(course);
    }

    public Mono<Course> findCourse(Long Id)
    {
        return courseRepository.findById(Id);
    }


}
