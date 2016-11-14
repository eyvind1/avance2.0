package com.example.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.dominio.Album;

public interface AlbumRepositorio extends Repository<Album, Integer> {
	void delete(Album album);

	Album save(Album album);

	@Query("SELECT a FROM Album a WHERE a.id = :id")
	Album buscarPorId(@Param("id") Integer id);

	@Query("SELECT a FROM Album a")
	List<Album> buscarTodos();

	@Query("SELECT a FROM Album a WHERE a.fechaCreacion >= :fecha")
	List<Album> buscarFechaCreacionMayorA(@Param("fecha") Date fecha);
}
