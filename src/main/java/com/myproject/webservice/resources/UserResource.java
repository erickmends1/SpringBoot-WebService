package com.myproject.webservice.resources;

import com.myproject.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> find(){
        User user = new User(1L, "Erick Mendes", "erickmendes@gmail.com", "98970188273", "123");
        return ResponseEntity.ok().body(user);
    }
}
