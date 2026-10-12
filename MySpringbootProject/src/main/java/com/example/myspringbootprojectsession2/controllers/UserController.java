package com.example.myspringbootprojectsession2.controllers;

import com.example.myspringbootprojectsession2.modals.entities.User;
import com.example.myspringbootprojectsession2.modals.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers(
            @RequestParam(required = false) String search
    ) {
        List<User> users = userService.findAllUsers();
        if (search == null || search.trim().isEmpty()) {
            return ResponseEntity.ok(users);
        }
        String keyword = search.trim().toLowerCase();
        List<User> filteredUsers = users.stream()
                .filter(user -> user.getEmail() != null && user.getEmail().toLowerCase().contains(keyword))
                .collect(Collectors.toList());
        return ResponseEntity.ok(filteredUsers);
    }
}
