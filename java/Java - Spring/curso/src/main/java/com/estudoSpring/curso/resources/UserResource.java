package com.estudoSpring.curso.resources;

import com.estudoSpring.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "maria", "maria@gmail.com", "449920012694", "123");
        return ResponseEntity.ok().body(u);
    }
}
