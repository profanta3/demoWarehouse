package com.example.demo.controller;

import com.example.demo.exception.PCComponentNotFoundException;
import com.example.demo.model.PCComponent;
import com.example.demo.repository.PCComponentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class PCComponentController {

    private final PCComponentRepository repository;


    public PCComponentController(PCComponentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/component")
    List<PCComponent> all() {
        return this.repository.findAll();
    }

    @GetMapping("/component/{id}")
    PCComponent one(@PathVariable Long id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new PCComponentNotFoundException(id));
    }
}