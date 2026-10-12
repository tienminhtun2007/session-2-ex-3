package com.example.myspringbootprojectsession2.modals.services;

import com.example.myspringbootprojectsession2.modals.entities.Task;
import com.example.myspringbootprojectsession2.modals.repositories.TaskRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServices {
    private final TaskRepositories taskRepositories;

    @Autowired
    public TaskServices(TaskRepositories taskRepositories) {
        this.taskRepositories = taskRepositories;
    }

    public List<Task> findAllTasks() {
        return taskRepositories.findAll();
    }
}
