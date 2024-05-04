package com.comrade.config;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class FlywayMigrationConfig {
    //@Bean
    public Flyway flyway(DataSource dataSource){
        Flyway flyway = Flyway.configure().load();
        return flyway;
    }
}
