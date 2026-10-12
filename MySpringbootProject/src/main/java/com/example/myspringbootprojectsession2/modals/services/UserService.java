package com.example.myspringbootprojectsession2.modals.services;

import com.example.myspringbootprojectsession2.modals.entities.User;
import com.example.myspringbootprojectsession2.modals.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private final UserRepositories userRepositories;
    @Autowired
    public UserService(UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }
    public List<User> findAllUsers() {
        return userRepositories.findAll();
    }
}
