package com.example.service;

import com.example.dominio.Album;
import com.example.dominio.Artista;
import com.example.dominio.Cancion;

/**
 * Created by eyvind on 24/11/16.
 */
public interface CancionService {
    public Cancion crearCancion(String nombre, String genero, String letra, Album album, Artista artista );
    public Cancion getSong(Integer id);

}
