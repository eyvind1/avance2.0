package com.example.servicio;

import com.example.dominio.Album;
import com.example.repositorio.AlbumRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class AlbumService {
    @Autowired
    AlbumRepositorio AlbumRepository;

    @Transactional
    public void save(Album album) {
        if (album.getId() == null) {
            AlbumRepository.persist(album);
        } else {
            AlbumRepository.merge(album);
        }
    }

    public Album get(Integer id) {
        return AlbumRepository.find(id);
    }

    public Collection<Album> getAll() {
        return AlbumRepository.findAll();
    }
}
