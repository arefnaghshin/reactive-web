package com.example.test.demo.controller;

import com.example.test.demo.model.Course;
import com.example.test.demo.model.CoursePerson;
import com.example.test.demo.model.Person;
import com.example.test.demo.repository.CoursePersonRepository;
import com.example.test.demo.repository.CourseRepository;
import com.example.test.demo.repository.PersonRepository;
import com.example.test.demo.service.CoursePersonService;
import com.example.test.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class PersonController {

    @Autowired
    private final PersonService personService;

    @Autowired
    private final CoursePersonService coursePersonService;

    public PersonController(PersonService personService, CoursePersonService coursePersonService) {
        this.coursePersonService=coursePersonService;
        this.personService=personService;
    }

    @PostMapping("/person")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Person> create(@RequestBody Person person) {
        return personService.createPerson(person);
    }
    @PostMapping("/person/{personId}/course/{courseId}")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<CoursePerson> createCourseForStudent(@PathVariable Integer personId,@PathVariable Integer courseId) {

        return coursePersonService.createCourseForPerson(personId,courseId);
    }
}
