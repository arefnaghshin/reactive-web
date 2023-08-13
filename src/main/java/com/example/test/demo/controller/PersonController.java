package com.example.test.demo.controller;

import com.example.test.demo.model.Course;
import com.example.test.demo.model.Person;
import com.example.test.demo.repository.PersonRepository;
import com.example.test.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PersonController {

    @Autowired
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping("/person")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Person> create(@RequestBody Person person)
    {
        return personRepository.save(person);
    }
}
