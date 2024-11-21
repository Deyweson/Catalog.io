package com.catalog.Catalog.io.controllers;


import com.catalog.Catalog.io.models.User;
import com.catalog.Catalog.io.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    private ResponseEntity<Object> Register(@RequestBody @Valid User user) {
        userRepository.save(user);
        return new ResponseEntity<Object>(user, HttpStatus.CREATED);
    }
}
