package com.myproject.webservice.services;

import com.myproject.webservice.entities.Product;
import com.myproject.webservice.entities.User;
import com.myproject.webservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        List<Product> list = repository.findAll();
        return list;
    }

    public Product findById(Long id){
        Optional<Product> product = repository.findById(id);
        return product.get();
    }
}
