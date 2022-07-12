
package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.TaskRepository;
import com.example.demo.model.Task;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskRepository taskRepo;

    @GetMapping("/get")
    public List<Task> getTasks() {

        List<Task> list = taskRepo.findAll();

        System.out.println("list size" + list.size());
        return list;
    }

    @GetMapping("/")
    public String getTasksNormal() {

        return "hellow world from tasks";
    }

}
