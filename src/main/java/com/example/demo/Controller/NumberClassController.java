package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.NumbersRepository;
import com.example.demo.model.NumberClass;

@RestController
@RequestMapping("/num")
public class NumberClassController {

    @Autowired
    NumbersRepository numRepo;

    @PostMapping("/addNumber")
    public NumberClass addNum(@RequestBody NumberClass num) {
        return numRepo.save(num);

    }
}
