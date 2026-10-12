package com.example.myspringbootprojectsession2.modals.repositories;

import com.example.myspringbootprojectsession2.modals.entities.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TaskRepositories {
    private final List<Task> tasks = new ArrayList<>();

    public TaskRepositories() {
        tasks.add(new Task(1L, "Thiết kế CSDL", "Thiết kế bảng User và Task", "high", 1L));
        tasks.add(new Task(2L, "Cài đặt môi trường", "Cài đặt JDK 17 và Spring Boot", "high", 1L));
        tasks.add(new Task(3L, "Tạo Entity User", "Định nghĩa các trường cho User", "medium", 2L));
        tasks.add(new Task(4L, "Tạo Entity Task", "Định nghĩa các trường cho Task", "medium", 2L));
        tasks.add(new Task(5L, "Viết UserRepository", "Mock danh sách dữ liệu User", "low", 2L));
        tasks.add(new Task(6L, "Viết TaskRepository", "Mock danh sách dữ liệu Task", "medium", 3L));
        tasks.add(new Task(7L, "Xây dựng UserService", "Xử lý logic nghiệp vụ User", "high", 1L));
        tasks.add(new Task(8L, "Xây dựng TaskService", "Xử lý logic nghiệp vụ Task", "medium", 3L));
        tasks.add(new Task(9L, "Tạo REST Controller", "Viết API GET cho User và Task", "high", 3L));
        tasks.add(new Task(10L, "Kiểm thử hệ thống", "Dùng Postman hoặc trình duyệt test API", "low", 2L));
    }

    public List<Task> findAll() {
        return tasks;
    }
}
