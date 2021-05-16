package com.example.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList<>();
    private static int idCounter = 0;

    public List<Todo> findAll() {
        todos.add(new Todo(idCounter++, "veenah", "Learn to Sing", new Date(), false));
        todos.add(new Todo(idCounter++, "veenah", "Learn Spring boot", new Date(), false));

        return todos;
    }

    public Todo deleteById(long id) {

        Todo todo = findById(id);
        if (todo == null) return null;

        if (todos.remove(todo)) return todo;

        return null;

    }

    public Todo findById(long id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }
}
