package com.myproject.webservice.services;

import com.myproject.webservice.entities.Category;
import com.myproject.webservice.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        List<Category> list = repository.findAll();
        return list;
    }
}
