package com.example.repositorio;

import com.example.dominio.Song;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;



import java.util.List;

public interface CancionRepositorio extends BaseRepository<Song, Integer> {
	/*Song save(Song cancion);
	

	@Query("SELECT c FROM Cancion c WHERE c.id = :id")
	Song buscarPorId(@Param("id") Integer id);

	@Query("SELECT c FROM Cancion c ORDER BY c.Reproducciones DESC")
	List<Song> Top100();*/
}
