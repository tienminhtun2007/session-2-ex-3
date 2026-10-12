package com.example.myspringbootprojectsession2.modals.entities;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Task {
    private long id;
    private String title;
    private String description;
    private String priority;
    private long assignedTo;

    public Task() {}
    public Task(long id, String title, String description, String priority, long assignedTo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.assignedTo = assignedTo;
    }
}
