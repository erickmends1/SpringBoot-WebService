package com.myproject.webservice.services;

import com.myproject.webservice.entities.Order;
import com.myproject.webservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        List<Order> list = repository.findAll();
        return list;
    }
}
