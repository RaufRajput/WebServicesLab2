package se.lab2webservices.api.service;

import java.util.List;

import se.lab2webservices.api.entity.Todo;
import se.lab2webservices.api.fiegnProxy.Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImp implements TodoService {

    @Autowired
    Proxy proxy;

    @Override
    public Todo getOne(Long id) {
        return proxy.getOne(id);
    }

    @Override
    public List<Todo> getAll() {
        return proxy.getAll();
    }

    @Override
    public Todo delete(Long id) {
        return proxy.delete(id);
    }

    @Override
    public Todo add(Todo todo) {
        return proxy.add(todo);
    }
    
}