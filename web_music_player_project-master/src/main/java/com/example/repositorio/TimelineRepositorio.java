package com.example.repositorio;

import java.util.List;

import com.example.dominio.BaseEntity;
import com.example.dominio.Song;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.dominio.Song;

public interface TimelineRepositorio extends BaseRepository<Song, Integer> {
	Song save(Song Song);

	@Query("SELECT c FROM Song c WHERE c.id = :id")
	Song buscarPorId(@Param("id") Integer id);

	@Query("SELECT c FROM Song c ORDER BY c.Reproducciones DESC")
	List<Song> Top100();
}