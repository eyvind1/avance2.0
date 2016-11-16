package com.example.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


import com.example.dominio.Administrador;
import com.example.dominio.Persona;
import com.example.dominio.Usuario;
import com.example.dominio.Cancion;
import com.example.dominio.Artista;
import com.example.dominio.Album;

public interface AdministradorRepositorio extends Repository<Administrador, Integer> {

	void delete(Administrador administrador);

	Administrador save(Administrador administrador);


	@Query("SELECT c FROM Administrador c WHERE c.username = :username AND c.password = :password")
    Administrador login_administrador(@Param("username") String username, @Param("password") String password);

	@Query("SELECT a FROM Administrador a WHERE a.ID_adm = :ID_adm")
	Administrador buscarPorId(@Param("Id_adm") Integer Id_adm);

	@Query("SELECT a FROM Administrador a")
	List<Administrador> buscarTodos();

	@Query("SELECT a FROM Administrador a where a.nombres = :nombres")
	Administrador buscarPorNombre (@Param("nombres") String nombres);

	@Query("SELECT a FROM Administrador a where a.apellidoPaterno = :apellidoPaterno")
	Administrador buscarPorApellidoPaterno (@Param("apellidoPaterno") String apellidoPaterno);

	@Query("SELECT a FROM Administrador a where a.apellidoMaterno = :apellidoMaterno")
	Administrador buscarPorApellidoMaterno (@Param("apellidoMaterno") String apellidoMaterno);

	@Query("DELETE FROM Artista c WHERE c.ID_artista = ?1")
    boolean Eliminar_Artista(Integer ID_artista);

    @Query("DELETE FROM Cancion c WHERE c.ID_cancion = ?1")
    boolean Eliminar_Cancion(Integer ID_cancion);

    @Query("DELETE FROM Usuario c WHERE c.ID_usuario = ?1")
    boolean Eliminar_Usuario(Integer ID_usuario);

    @Query("DELETE FROM Album c WHERE c.ID_album = ?1")
    boolean Eliminar_Album(Integer ID_usuario);

    @Query("SELECT a FROM Artista a")
	List<Artista> buscarTodosArtistas();

	@Query ("SELECT a FROM Cancion a")
	List<Cancion> buscarTodasCanciones();

	@Query ("SELECT a FROM Album a")
	List<Album> buscarTodasAlbumnes();



}

