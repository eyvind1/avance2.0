package com.example.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


import com.example.dominio.Artista;

public interface ArtistaRepositorio extends Repository<Artista, Integer> {



}
