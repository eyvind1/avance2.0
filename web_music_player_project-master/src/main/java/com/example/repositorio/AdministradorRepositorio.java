package com.example.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


import com.example.dominio.Administrador;

public interface AdministradorRepositorio extends Repository<Administrador, Integer> {

	void delete(Administrador administrador);

	Administrador save(Administrador administrador);


	@Query("SELECT a FROM Administrador a WHERE a.id = :id")
	Administrador buscarPorId(@Param("id") Integer id);

	@Query("SELECT a FROM Administrador a")
	List<Administrador> buscarTodos();

	@Query("SELECT a FROM Administrador a where a.nombre = :nombre")
	Administrador buscarPorNombre (@Param("nombre") String nombre);

	@Query("SELECT a FROM Administrador a where a.apellidoPaterno = :apellidoPaterno")
	Administrador buscarPorApellidoPaterno (@Param("apellidoPaterno") String apellidoPaterno);

	@Query("SELECT a FROM Administrador a where a.apellidoMaterno = :apellidoMaterno")
	Administrador buscarPorApellidoMaterno (@Param("apellidoMaterno") String apellidoMaterno);


}
