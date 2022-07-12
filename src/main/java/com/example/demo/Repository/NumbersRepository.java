package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.NumberClass;

public interface NumbersRepository extends JpaRepository<NumberClass, Integer> {

}
