package com.exemploweb.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.exemploweb.entities.User;
import com.exemploweb.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable Long id) {
        Optional<User> u = service.findById(id);
        return ResponseEntity.ok().body(u);
    }

    /**
     * When inserting an element in the DataBase it's a good practice to have 
     * a '201 Created' status return. To do so it's necessary use Spring's ServletUriComponentsBuilder
     * to build a URI for a specific resource.
     * @param user
     */
    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user) {
        user = service.inseret(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                  .path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(user);
    }
}
