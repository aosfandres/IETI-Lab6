package edu.escuelaing.ieti.lab6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.ieti.lab6.model.User;
import edu.escuelaing.ieti.lab6.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserById(@PathVariable int userId)  {
        return new ResponseEntity<>(userService.getById(String.valueOf(userId)), HttpStatus.ACCEPTED);
    }

    @PostMapping()
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.create(user), HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<?> updateUser(@RequestBody User user)  {
        return new ResponseEntity<>(userService.update(user), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> removeUser(@PathVariable int userId)  {
        userService.remove(String.valueOf(userId));
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}   
