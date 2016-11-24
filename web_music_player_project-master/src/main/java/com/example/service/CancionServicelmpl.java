package com.example.service;


import com.example.dominio.Album;
import com.example.dominio.Artista;
import com.example.dominio.Cancion;
import com.example.repositorio.CancionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class CancionServicelmpl {
    @Autowired
    private CancionRepositorio cancionRepositorio;

    public Cancion crearCancion(String nombre, String genero, String letra, Album album, Artista artista ){
        Cancion cancion = new Cancion(nombre,genero,letra,album,artista);
        cancionRepositorio.save(cancion);
        return cancion;
    }

    public Cancion getSong(Integer id){
        return cancionRepositorio.buscarPorId(id);
    }
}
