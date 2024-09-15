package com.exemploweb.springdemo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemploweb.springdemo.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Mary", "Mary@gmail.com", "5555555", "123456");
        return ResponseEntity.ok().body(u);
    }
}
