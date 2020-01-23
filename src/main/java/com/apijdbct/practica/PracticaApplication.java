package com.apijdbct.practica;


import com.apijdbct.practica.modelo.Videojuego;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class PracticaApplication implements CommandLineRunner {

  private static final Logger log = LoggerFactory.getLogger(PracticaApplication.class);

  public static void main(String args[]) {
    SpringApplication.run(PracticaApplication.class, args);
  }

  @Autowired
  JdbcTemplate jdbcTemplate;

  @Override
  public void run(String... strings) throws Exception {

    jdbcTemplate.query(
        "SELECT * FROM videojuego WHERE id = ?", new Object[] { "3" },
        (rs, rowNum) -> new Videojuego(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4))
    ).forEach(customer -> log.info(customer.toString()));
    
   
    
    
  }
}