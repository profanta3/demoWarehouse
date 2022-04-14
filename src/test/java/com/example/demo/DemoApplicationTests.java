package com.example.demo;

import com.example.demo.data.CSVDataReader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		CSVDataReader dataReader = new CSVDataReader();

		String file = "data.csv";
	}
}
