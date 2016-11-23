package com.example.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.dominio.Administrador;
import com.example.dominio.Usuario;
import com.example.dominio.Cancion;
import com.example.dominio.Album;
import com.example.dominio.Artista;
import com.example.dominio.Persona;
import com.example.dominio.Playlist;

import java.util.List;

public interface AdministradorRepositorio extends Repository<Administrador, Integer>{
    Administrador save(Administrador administrador);

    @Query("SELECT c FROM Administrador c WHERE c.username = :username AND c.password = :password")
    Administrador login_administrador(@Param("username") String username, @Param("password") String password);


    /*seleccionar por nombre */
    @Query("SELECT c FROM Usuario c WHERE c.username = ?1")
    Usuario find_usuario(String username);

    @Query("SELECT c FROM Artista c WHERE c.nombre = ?1")
    Artista find_artista(String nombre);

    @Query ("SELECT c FROM Cancion c where c.nombre = ?1")
    Cancion find_cancion(String nombre);

    @Query ("SELECT c FROM Album c where c.nombre = ?1")
    Album find_album(String nombre);

    /*seleccionar todos */

    @Query ("SELECT c FROM Artista c")
    List<Artista> Todos_artistas();

    @Query ("SELECT c FROM Cancion c")
    List<Cancion> Todas_cancion();

    @Query ("SELECT c FROM Album c")
    List<Album> Todas_album();


}
