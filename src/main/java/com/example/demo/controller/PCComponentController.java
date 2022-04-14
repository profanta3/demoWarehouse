package com.example.demo.controller;

import com.example.demo.exception.PCComponentNotFoundException;
import com.example.demo.model.PCComponent;
import com.example.demo.repository.PCComponentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class PCComponentController {

    private final PCComponentRepository repository;


    public PCComponentController(PCComponentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/components")
    List<PCComponent> all() {
        return this.repository.findAll();
    }

    @GetMapping("/component/{id}")
    PCComponent one(@PathVariable Long id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new PCComponentNotFoundException(id));
    }

    @GetMapping("/")
    public String getHome() {
        return "<h1>Welcome to Warehouse API!</h1>" +
                "Go to: <span style='font-family:monospace; font-weight:bold;'><a href=\"/h2-console\">/h2-console</a></span> for db access.<br><br>" +
                "Go to <span style='font-family:monospace; font-weight:bold;'><a href=\"/components\">/components</a></span> for PCcomponent API<br>" +
                "Use <span style='font-family:monospace; font-weight:bold;'><a href=\"/component/1\">/component/id</a></span> for specific component.";
    }
}
