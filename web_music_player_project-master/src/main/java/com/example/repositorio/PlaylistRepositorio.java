package com.example.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.dominio.Album;
import com.example.dominio.Playlist;
import com.example.dominio.Usuario;


public interface PlaylistRepositorio extends Repository<Playlist,Integer> {
	void delete(Playlist playlist);
	
	Playlist save(Playlist playlist);
	
	@Query("SELECT p FROM Playlist p WHERE p.ID_usuario = :ID_usuario")
	Playlist buscarPorId(@Param("ID_usuario") Integer ID_usuario);

	@Query("SELECT p FROM Playlist p")
	List<Playlist> buscarTodos(@Param ("usuario") Usuario usuario );

}
