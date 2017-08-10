package com.react.demo.controller;

import com.react.demo.domain.Person;
import com.react.demo.service.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bishal on 7/12/17.
 */
@RestController
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(value = "/persons")
    Page<Person> list(Pageable pageable){
        Page<Person> personPage = personService.listAllby(pageable);
        return personPage;
    }


}
