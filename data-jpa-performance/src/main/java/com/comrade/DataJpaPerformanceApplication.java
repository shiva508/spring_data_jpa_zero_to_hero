package com.comrade;

import com.comrade.entity.ComradeEntity;
import com.comrade.repository.ComradeRepository;
import com.comrade.service.ComradeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
@AllArgsConstructor
public class DataJpaPerformanceApplication implements CommandLineRunner {
    @Autowired
    ComradeService comradeService;
    @Autowired
    private ComradeRepository comradeRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(DataJpaPerformanceApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {

        };
    }

    @Override
    public void run(String... args) throws Exception {
        comradeRepository.deleteAll();
        long startDate = System.currentTimeMillis();
        var comrades = IntStream.range(1, 1000).mapToObj(value -> ComradeEntity.builder()
                .email(String.format("dasarishiva.%d@gmail.com", value))
                .firstName(String.format("Shiva%d", value))
                .lastName(String.format("Dasari%d", value)).build()).toList();
        System.out.println("=============");
        System.out.println(comrades);
        comradeService.replicateData(comrades);
        //tedbcTemplateSave(comrades);
        long lastDate = System.currentTimeMillis();
        System.out.println("Time taken ; " + (lastDate - startDate));
    }

    private void tedbcTemplateSave(List<ComradeEntity> comrades) {
        String query = "INSERT INTO customers( email, first_name, last_name) VALUES ( ?, ?, ?)";
        jdbcTemplate.batchUpdate(query, comrades, 100, new ParameterizedPreparedStatementSetter<ComradeEntity>() {
            @Override
            public void setValues(PreparedStatement ps, ComradeEntity argument) throws SQLException {
                ps.setString(1, argument.getEmail());
                ps.setString(2, argument.getFirstName());
                ps.setString(3, argument.getLastName());
            }
        });
    }


}