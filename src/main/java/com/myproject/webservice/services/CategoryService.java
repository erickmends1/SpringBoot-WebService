package com.myproject.webservice.services;

import com.myproject.webservice.entities.Category;
import com.myproject.webservice.entities.Order;
import com.myproject.webservice.repositories.CategoryRepository;
import com.myproject.webservice.services.exception.ResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        List<Category> list = repository.findAll();
        return list;
    }

    public Category findById(Long id){
        Optional<Category> category = repository.findById(id);
        return category.orElseThrow(() -> new ResourceNotFound(id));
    }
}
