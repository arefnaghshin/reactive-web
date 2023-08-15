package com.example.test.demo.service;

import com.example.test.demo.model.Person;
import com.example.test.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class PersonService {
    private final PersonRepository personRepository;


    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Mono<Person> getPerson(Integer personId){
        return personRepository.findById(personId);
    }

    public Mono<Person> createPerson(Person person){
        return personRepository.save(person);
    }



}
