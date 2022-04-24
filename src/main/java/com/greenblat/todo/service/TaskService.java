package com.greenblat.todo.service;

import com.greenblat.todo.dao.TaskRepository;
import com.greenblat.todo.entity.TaskEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskEntity> getAllTask() {
        return taskRepository.findAll();
    }

    public TaskEntity getTaskById(int id) {
        Optional<TaskEntity> optionalTask = taskRepository.findById(id);
        TaskEntity taskEntity = null;
        if (optionalTask.isPresent()) {
            taskEntity = optionalTask.get();
        }
        return taskEntity;
    }

    public TaskEntity addTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }

    public TaskEntity updateTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }

    public int deleteTask(int id) {
        taskRepository.deleteById(id);
        return id;
    }
}
