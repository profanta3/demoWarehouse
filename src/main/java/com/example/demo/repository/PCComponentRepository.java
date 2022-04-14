package com.example.demo.repository;

import com.example.demo.model.PCComponent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PCComponentRepository extends JpaRepository<PCComponent, Long> {
}
