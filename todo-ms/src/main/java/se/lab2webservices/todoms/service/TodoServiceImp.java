package se.lab2webservices.todoms.service;

import java.util.List;

import se.lab2webservices.todoms.entity.Todo;
import se.lab2webservices.todoms.repo.TodoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImp implements TodoService {

    TodoRepo todoRepo;

    public TodoServiceImp(@Autowired TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public Todo getOne(Long id) {
        return todoRepo.getOne(id);
    }

    @Override
    public List<Todo> getAll() {
        return todoRepo.findAll();
    }

    @Override
    public Todo delete(Long id) {
        Todo todo = getOne(id);
        todoRepo.delete(todo);
        return todo;
    }

    @Override
    public Todo add(Todo todo) {
        return todoRepo.save(todo);
    }





}