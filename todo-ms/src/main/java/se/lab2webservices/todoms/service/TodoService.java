package se.lab2webservices.todoms.service;

import java.util.List;

import se.lab2webservices.todoms.entity.Todo;

public interface TodoService
{
    public Todo getOne(Long id);
    public List<Todo> getAll();
    public Todo delete(Long id);
    public Todo add(Todo todo);
}