package com.example.repositorio.jpa;


import com.example.dominio.Artist;

import com.example.repositorio.ArtistaRepositorio;
import org.springframework.stereotype.Repository;

@Repository
public class JpaArtistaRepositorio extends JpaBaseRepository<Artist,Integer> implements ArtistaRepositorio{
}
