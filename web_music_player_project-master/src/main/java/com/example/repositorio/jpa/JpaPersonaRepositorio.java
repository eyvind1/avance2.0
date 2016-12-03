package com.example.repositorio.jpa;

import com.example.dominio.Person;

import com.example.repositorio.PersonaRepositorio;
import org.springframework.stereotype.Repository;

@Repository
public class JpaPersonaRepositorio extends JpaBaseRepository <Person,Integer> implements PersonaRepositorio {
}
