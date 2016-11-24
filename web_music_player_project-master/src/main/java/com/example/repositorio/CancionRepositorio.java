package com.example.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.dominio.Cancion;

import java.util.List;

public interface CancionRepositorio extends Repository<Cancion, Integer> {
	Cancion save(Cancion cancion);

	@Query("SELECT c FROM Cancion c WHERE c.id = :id")
	Cancion buscarPorId(@Param("id") Integer id);

	@Query("SELECT c FROM Cancion c ORDER BY c.Reproducciones DESC")
	List<Cancion> Top100();



	List<Cancion> findAll();
}
