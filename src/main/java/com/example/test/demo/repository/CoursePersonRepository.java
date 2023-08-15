package com.example.test.demo.repository;

import com.example.test.demo.model.CoursePerson;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CoursePersonRepository extends ReactiveCrudRepository<CoursePerson, Integer> {
}
