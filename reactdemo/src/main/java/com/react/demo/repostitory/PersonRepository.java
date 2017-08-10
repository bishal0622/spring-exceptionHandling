package com.react.demo.repostitory;

import com.react.demo.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by bishal on 7/12/17.
 */
public interface PersonRepository extends PagingAndSortingRepository<Person,Long> {
}
