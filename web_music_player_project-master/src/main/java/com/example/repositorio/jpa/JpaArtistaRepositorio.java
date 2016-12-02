package com.example.repositorio.jpa;


import com.example.dominio.Artista;
import com.example.repositorio.ArtistaRepositorio;
import org.springframework.stereotype.Repository;

@Repository
public class JpaArtistaRepositorio extends JpaBaseRepository<Artista,Integer> implements ArtistaRepositorio{
}
