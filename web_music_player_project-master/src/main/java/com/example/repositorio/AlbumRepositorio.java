package com.example.repositorio;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.example.dominio.Artista;
import com.example.dominio.Cancion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.dominio.Album;

public interface AlbumRepositorio extends Repository<Album, Integer> {


	Collection<Cancion> findSongsByAlbumId(Integer albumId);

	Collection<Artista> findArtistByAlbumId(Integer albumId);

	boolean save(Album album);
	void remove(Album album);
}
