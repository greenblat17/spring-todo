package com.greenblat.todo.controller;

import com.greenblat.todo.entity.TaskEntity;
import com.greenblat.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ToDoController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/todo")
    public List<TaskEntity> showAllUsers() {
        return taskService.getAllTask();
    }

    @GetMapping("/todo/{taskId}")
    public TaskEntity getTask(@PathVariable("taskId") int id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/todo")
    public TaskEntity addTask(@RequestBody TaskEntity taskToAdd) {
        return taskService.addTask(taskToAdd);
    }

    @PutMapping("/todo")
    public TaskEntity updateTask(@RequestBody TaskEntity taskToUpdate) {
        return taskService.updateTask(taskToUpdate);
    }

    @DeleteMapping("/todo/{taskId}")
    public int deleteTask(@PathVariable("taskId") int id) {
        return taskService.deleteTask(id);
    }


}
