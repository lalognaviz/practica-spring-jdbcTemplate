package com.apijdbct.practica.modelo;

public class Videojuego {
    private int id;
    private String nombre;
    private String descripcion;
    private String imgUrl;

    public Videojuego(int id, String nombre, String descripcion, String imgUrl) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imgUrl = imgUrl;
    }

    public Videojuego() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imgUrl=" + imgUrl + '}';
    }
    
   
    
}
