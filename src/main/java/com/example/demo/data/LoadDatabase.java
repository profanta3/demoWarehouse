package com.example.demo.data;

import com.example.demo.model.PCComponent;
import com.example.demo.repository.PCComponentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LoadDatabase {
    
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    
    @Bean
    CommandLineRunner initDatabase(PCComponentRepository repository) {
        
        CSVDataReader csvDataReader = new CSVDataReader();
        List<PCComponent> list = csvDataReader.getObjects("data.csv");
        
        
        return args -> {
            for (PCComponent component :
                    list) {
                log.info("preloading..."+repository.save(component));
            }
        };
    }
}
