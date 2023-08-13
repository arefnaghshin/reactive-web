package com.example.test.demo.repository;

import com.example.test.demo.model.Course;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CourseRepository extends ReactiveCrudRepository<Course,Long> {
}
