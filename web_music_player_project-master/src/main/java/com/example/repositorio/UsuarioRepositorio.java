package com.example.repositorio;

import com.example.dominio.Album;
import com.example.dominio.Cancion;
import com.example.dominio.Playlist;
import com.example.dominio.Usuario;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UsuarioRepositorio extends Repository<Usuario, Integer> {
    Usuario save (Usuario usuario);

    @Query("SELECT c FROM Usuario c WHERE c.username = :username AND c.password = :password")
    Usuario login_usuario(@Param("username") String username, @Param("password") String password);

    @Query("SELECT c FROM Usuario c WHERE c.username = ?1 or CONCAT (c.ID_usuario, '') = ?1")
    Usuario find_usuario(String username);

    @Query("DELETE FROM Playlist c WHERE c.ID_playlist = ?1")
    boolean Eliminar_playlist(Integer ID_playlist);

    @Query("DELETE FROM Usuario c WHERE c.ID_usuario = ?1")
    boolean Eliminarse(Integer ID_usuario);

    @Query("SELECT c FROM Playlist c WHERE c.nombre = ?1")
    Playlist Buscar_Playlist(String nombre);

    @Query("SELECT c FROM Cancion c WHERE c.nombre LIKE ?1"+"%")
    List<Cancion> Buscar_Cancion(String nombre);

    @Query("SELECT c FROM Album c WHERE c.nombre LIKE ?1"+"%")
    List<Album> Buscar_Album(String nombre);

    @Query("SELECT c FROM Usuario c WHERE c.ID_usuario = ?1")
    Usuario find_usuario2(Integer ID_usuario);

    @Query("SELECT c.seguidores FROM Usuario c WHERE c.username = ?1")
    List<Usuario> find_seguidores_id(String username);
}
