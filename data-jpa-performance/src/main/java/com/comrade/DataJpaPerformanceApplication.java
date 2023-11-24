package com.comrade;

import com.comrade.entity.ComradeEntity;
import com.comrade.service.ComradeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
@AllArgsConstructor
public class DataJpaPerformanceApplication implements CommandLineRunner {
    @Autowired
    ComradeService comradeService;

    public static void main(String[] args) {
        SpringApplication.run(DataJpaPerformanceApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(){
        return args -> {

        };
    }

    @Override
    public void run(String... args) throws Exception {
        long startDate = System.currentTimeMillis();
        System.out.println("=============");
        var comrades = IntStream.range(1,1000).mapToObj( value -> ComradeEntity.builder()
                .email(String.format("dasarishiva.%d@gmail.com",value))
                .firstName(String.format("Shiva%d",value))
                .lastName(String.format("Dasari%d",value)).build()).toList();
        System.out.println(comrades);
        comradeService.replicateData(comrades);
        long lastDate = System.currentTimeMillis();
        System.out.println("Time taken ; "+ (lastDate-startDate));
    }
}