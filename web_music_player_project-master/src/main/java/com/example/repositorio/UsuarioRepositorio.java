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
    Usuario loginUsuario(@Param("username") String username, @Param("password") String password);

    @Query("SELECT c FROM Usuario c WHERE c.username = ?1 or CONCAT (c.ID_usuario, '') = ?1")
    Usuario findUsuario(String username);

    @Query("DELETE FROM Playlist c WHERE c.ID_playlist = ?1")
    boolean EliminarPlaylist(Integer iDPlaylist);

    @Query("DELETE FROM Usuario c WHERE c.ID_usuario = ?1")
    boolean eliminarse(Integer ID_usuario);

    @Query("SELECT c FROM Playlist c WHERE c.nombre = ?1")
    Playlist buscarPlaylist(String nombre);

    @Query("SELECT c FROM Cancion c WHERE c.nombre LIKE ?1"+"%")
    List<Cancion> buscarCancion(String nombre);

    @Query("SELECT c FROM Album c WHERE c.nombre LIKE ?1"+"%")
    List<Album> buscarAlbum(String nombre);

    @Query("SELECT c FROM Usuario c WHERE c.ID_usuario = ?1")
    Usuario findUsuario2(Integer iDUsuario);

    @Query("SELECT c.seguidores FROM Usuario c WHERE c.username = ?1")
    List<Usuario> findSeguidores_id(String userName);
}
