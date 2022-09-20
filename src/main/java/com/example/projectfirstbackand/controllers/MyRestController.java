package com.example.projectfirstbackand.controllers;


import com.example.projectfirstbackand.entity.PersonEntity;
import com.example.projectfirstbackand.repository.PersonEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    PersonEntityRepository personEntityRepository;


    @PostMapping("/persons")
    @CrossOrigin(origins = "http://localhost:3000")
    public PersonEntity addEmployee(@RequestBody PersonEntity personEntity){
        System.out.println(personEntity);
        personEntityRepository.save(personEntity);
        return personEntity;
    }
}
