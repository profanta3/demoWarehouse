package com.example.demo;

import com.example.demo.data.CSVDataReader;
import com.example.demo.model.PCComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("")
	public String getHome() {
		return "<h1>Welcome to Warehouse API!</h1>" +
				"Go to: <span style='font-family:monospace'>/h2-console</span> for db access.<br>" +
				"Go to <span style='font-family:monospace'>/api/components</span> for PCcomponent API";
	}
}
