package com.example.myspringbootprojectsession2.controllers;

import com.example.myspringbootprojectsession2.modals.entities.Task;
import com.example.myspringbootprojectsession2.modals.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskServices taskServices;

    @Autowired
    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }

    @GetMapping
    public ResponseEntity<List<Task>> findAllTasks(
            @RequestParam (required = false) String search
    ) {
        List<Task> tasks = taskServices.findAllTasks();
        if (search == null || search.trim().isEmpty()) {
            return ResponseEntity.ok(tasks);
        }
        String keyword = search.trim().toLowerCase();
        List<Task> filteredTasks = tasks.stream()
                .filter(task -> task.getTitle() != null && task.getTitle().toLowerCase().contains(keyword))
                .collect(Collectors.toList());
        return ResponseEntity.ok(filteredTasks);
    }
}
