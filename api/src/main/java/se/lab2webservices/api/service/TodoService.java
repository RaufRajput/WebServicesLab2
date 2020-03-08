package se.lab2webservices.api.service;

import java.util.List;

import se.lab2webservices.api.entity.Todo;


public interface TodoService
{
    public Todo getOne(Long id);
    public List<Todo> getAll();
    public Todo delete(Long id);
    public Todo add(Todo todo);
}