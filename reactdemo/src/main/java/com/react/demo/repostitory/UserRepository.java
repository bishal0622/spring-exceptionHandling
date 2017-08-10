package com.react.demo.repostitory;

import com.react.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bishal on 6/20/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
