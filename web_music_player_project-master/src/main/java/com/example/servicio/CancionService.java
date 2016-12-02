package com.example.servicio;

import com.example.dominio.Song;
import com.example.repositorio.CancionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class CancionService {
    @Autowired
    CancionRepositorio songRepository;

    @Transactional
    public void save(Song song) {
        if (song.getId() == null) {
            songRepository.persist(song);
        } else {
            songRepository.merge(song);
        }
    }

    public Song get(Long id) {
        return songRepository.find(id);
    }

    public Collection<Song> getAll() {
        return songRepository.findAll();
    }
}
