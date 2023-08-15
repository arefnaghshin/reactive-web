package com.example.test.demo.service;

import com.example.test.demo.model.Course;
import com.example.test.demo.model.CoursePerson;
import com.example.test.demo.repository.CoursePersonRepository;
import com.example.test.demo.repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class CoursePersonService {
    private final CoursePersonRepository coursePersonRepository;


    public CoursePersonService(CoursePersonRepository coursePersonRepository) {
        this.coursePersonRepository = coursePersonRepository;
    }

    public Mono<CoursePerson> createCourseForPerson(Integer personId, Integer courseId)
    {
        CoursePerson coursePerson=new CoursePerson(personId,courseId);
        return coursePersonRepository.save(coursePerson);
    }
}
