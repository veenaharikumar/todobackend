package com.example.rest.webservices.restfulwebservices.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoController {

    @Autowired
    private TodoHardcodedService todoHardcodedService;

    @GetMapping("/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username) {
        return todoHardcodedService.findAll();
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id) {
        Todo todo =todoHardcodedService.deleteById(id);

        if(todo == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok().build();
    }
}
