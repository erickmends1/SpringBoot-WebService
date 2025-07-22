package com.myproject.webservice.services.exception;

public class ResourceNotFound extends RuntimeException {
    public ResourceNotFound(Object id){
        super("Error, resource not found. Id " + id);
    }
}
