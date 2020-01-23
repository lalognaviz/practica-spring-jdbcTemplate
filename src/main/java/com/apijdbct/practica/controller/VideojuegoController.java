package com.apijdbct.practica.controller;

import com.apijdbct.practica.modelo.Videojuego;
import com.apijdbct.practica.services.VideojuegoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideojuegoController {
    @Autowired
    VideojuegoService service; 
    @GetMapping("/todos")
    public List<Videojuego> getall(){
       return service.retornall();
        
    }
    
    @GetMapping("/get/{id}")
	public Videojuego getone(@PathVariable(value = "id") int id) {
		return service.retornaid(id);
	}
        
        @GetMapping("/fetch")//http://localhost:8080/fetch?id=(id a colocar)
	public Videojuego getuno(@RequestParam(value = "id", defaultValue = "3") int id) {
		return service.retornaid(id);
        }
    
}
