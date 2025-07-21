package com.myproject.webservice.services;

import com.myproject.webservice.entities.User;
import com.myproject.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        List<User> list = repository.findAll();
        return list;
    }

    public User findById(Long id){
        Optional<User> user = repository.findById(id);
        return user.get();
    }
}
