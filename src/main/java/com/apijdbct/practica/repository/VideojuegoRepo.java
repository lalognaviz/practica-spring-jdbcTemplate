package com.apijdbct.practica.repository;

import com.apijdbct.practica.modelo.Videojuego;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VideojuegoRepo {

    @Autowired
    JdbcTemplate template;

    public List<Videojuego> getAllVideojuegos() {
        return template.query("SELECT * FROM `videojuego`", (rs, rowNum)
                -> new Videojuego(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));

    }

    public Videojuego getVideojuegoById(int id) {
        String sql = "SELECT * FROM videojuego WHERE id = ?";
        return template.queryForObject(sql, new Object[]{id}, (rs, rowNum)
                -> new Videojuego(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)));

    }

}
