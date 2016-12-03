package com.example.repositorio;


import com.example.dominio.Playlist;


public interface PlaylistRepositorio extends BaseRepository<Playlist, Integer> {
    /*List<Playlist> findAll();*/
}
 /*
  Playlist save(Playlist playlist);
  
  @Query("SELECT p FROM Playlist p WHERE p.ID_usuario = :ID_usuario")
  Playlist buscarPorId(@Param("ID_usuario") Integer ID_usuario);

  @Query("SELECT p FROM Playlist p")
  List<Playlist> buscarTodos(@Param ("usuario") Usuario usuario );}*/