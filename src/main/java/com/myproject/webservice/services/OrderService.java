package com.myproject.webservice.services;

import com.myproject.webservice.entities.Order;
import com.myproject.webservice.entities.Product;
import com.myproject.webservice.repositories.OrderRepository;
import com.myproject.webservice.services.exception.ResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        List<Order> list = repository.findAll();
        return list;
    }

    public Order findById(Long id){
        Optional<Order> order = repository.findById(id);
        return order.orElseThrow(() -> new ResourceNotFound(id));
    }
}
