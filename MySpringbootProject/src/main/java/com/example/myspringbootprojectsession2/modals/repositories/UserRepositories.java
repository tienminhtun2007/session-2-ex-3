package com.example.myspringbootprojectsession2.modals.repositories;

import com.example.myspringbootprojectsession2.modals.entities.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepositories {
    private final List<User> users = new ArrayList<>();
    public UserRepositories() {
        users.add(new User(1, "John Doe", "john.doe@example.com", "USER"));
        users.add(new User(2, "Jane Smith", "jane.smith@example.com", "USER"));
        users.add(new User(3, "Admin User", "admin.user@example.com", "ADMIN"));
    }

    public List<User> findAll() {
        return users;
    }

}
