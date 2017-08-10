package com.react.demo.service;

import com.react.demo.domain.Person;
import com.react.demo.repostitory.PersonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by bishal on 7/12/17.
 */
@Service
@Transactional
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Page<Person> listAllby(Pageable pageable) {
        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, "age"));
        Pageable pageable1 = new PageRequest(3,3,sort);
        System.out.println(pageable1.first());
       return personRepository.findAll(pageable);
    }
}
