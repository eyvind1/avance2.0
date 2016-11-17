package com.example.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


import com.example.dominio.Artista;

public interface ArtistaRepositorio extends Repository<Artista, Integer> {

	void delete(Artista artista);

	Artista save(Artista artista);


	@Query("SELECT a FROM Artista a WHERE a.ID_artista = :ID_artista")
	Artista buscarPorId(@Param("Id_artista") Integer Id_artista);

	@Query("SELECT a FROM Artista a")
	List<Artista> buscarTodos();

	@Query("SELECT a FROM Artista a where a.nombre = :nombre")
	Artista buscarPorNombre (@Param("nombre") String nombre);



}
