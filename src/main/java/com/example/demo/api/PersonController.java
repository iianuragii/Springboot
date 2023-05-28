package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }
}
