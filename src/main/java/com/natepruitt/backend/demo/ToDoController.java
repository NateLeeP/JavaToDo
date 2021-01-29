package com.natepruitt.backend.demo.controller;

import com.natepruitt.backend.demo.data.ToDo;
import com.natepruitt.backend.demo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public List<ToDo> findAll(){
        return toDoService.findAll();
    }

  /*
    @GetMapping("/{id}")
    public ToDo findById(@PathVariable String id){
        return toDoService.findById(id);
    }
  */
    @PostMapping
    public String create(@RequestBody ToDo toDo){
        toDoService.save(toDo);
        return "Post successful!";
    }

    @PutMapping("/{id}")
    public ToDo update(@RequestBody ToDo toDo){
        return toDoService.save(toDo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        toDoService.deleteById(id);
    }

}