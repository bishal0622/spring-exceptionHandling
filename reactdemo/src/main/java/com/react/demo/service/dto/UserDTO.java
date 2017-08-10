package com.react.demo.service.dto;

import com.react.demo.domain.User;

/**
 * Created by bishal on 6/20/17.
 */
public class UserDTO {

    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserDTO() {
    }

    public UserDTO(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public UserDTO(User user){
        this(user.getId(),user.getUsername(),user.getPassword());
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
