package com.example.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.dominio.Cancion;

public interface CancionRepositorio extends Repository<Cancion, Integer> {
	Cancion save(Cancion cancion);

	@Query("SELECT c FROM Cancion c WHERE c.id = :id")
	Cancion buscarPorId(@Param("id") Integer id);
}
