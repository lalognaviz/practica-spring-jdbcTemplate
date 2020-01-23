package com.apijdbct.practica.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.apijdbct.practica")
public class MysqlConfig {
    @Bean
    public DataSource ds(){
         DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/videojuegos?serverTimezone=GMT-3");
        dataSource.setUsername("videojuegos");
        dataSource.setPassword("videojuegos");
 
        return dataSource;
    
    }
    
}
