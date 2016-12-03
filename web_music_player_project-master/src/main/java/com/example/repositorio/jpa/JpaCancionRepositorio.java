package com.example.repositorio.jpa;


import com.example.dominio.Song;
import com.example.repositorio.CancionRepositorio;
import org.springframework.stereotype.Repository;

@Repository
public class JpaCancionRepositorio extends JpaBaseRepository<Song, Integer> implements CancionRepositorio {
}
