package com.apijdbct.practica.services;

import com.apijdbct.practica.modelo.Videojuego;
import com.apijdbct.practica.repository.VideojuegoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class VideojuegoService {
    
   @Autowired
   VideojuegoRepo repo;
   
   public List<Videojuego> retornall(){
       return repo.getAllVideojuegos();
   }
   
   public Videojuego retornaid(int id){
       return repo.getVideojuegoById(id);
   }
    
}
