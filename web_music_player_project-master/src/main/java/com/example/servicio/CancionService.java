package com.example.servicio;

/**
 * Created by Darkar on 11/24/16.
 */

import com.example.dominio.Album;
import com.example.dominio.Artista;
import com.example.dominio.Cancion;

public interface CancionService {
    public Cancion crearCancion(String nombre,String genero,String letra, Album album, Artista artista );
    public Cancion getSong(Integer id);
}

