package com.example.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


import com.example.dominio.Administrador;
import com.example.dominio.Persona;
import com.example.dominio.Usuario;

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


}

