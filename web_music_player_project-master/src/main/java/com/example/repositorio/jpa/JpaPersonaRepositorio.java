package com.example.repositorio.jpa;

import com.example.dominio.Persona;
import com.example.repositorio.PersonaRepositorio;
import org.springframework.stereotype.Repository;

@Repository
public class JpaPersonaRepositorio extends JpaBaseRepository <Persona,Integer> implements PersonaRepositorio {
}
