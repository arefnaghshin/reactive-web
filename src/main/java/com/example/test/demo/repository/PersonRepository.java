package com.example.test.demo.repository;


import com.example.test.demo.model.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PersonRepository extends ReactiveCrudRepository<Person,Integer> {
}
