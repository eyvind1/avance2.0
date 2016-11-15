package com.example.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


import com.example.dominio.Persona;

public interface PersonaRepositorio extends Repository<Persona, Integer> {

	void delete(Persona persona);

	Persona save(Persona persona);


}