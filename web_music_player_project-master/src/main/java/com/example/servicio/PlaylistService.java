package com.example.servicio;

import com.example.dominio.Playlist;
import com.example.repositorio.PlaylistRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class PlaylistService {
    @Autowired
    PlaylistRepositorio playlistRepository;

    @Transactional
    public void save(Playlist playlist) {
        if (playlist.getId() == null) {
            playlistRepository.persist(playlist);
        } else {
            playlistRepository.merge(playlist);
        }
    }

    public Playlist get(Long id) {
        return playlistRepository.find(id);
    }


    public Collection<Playlist> getAll() {
        return playlistRepository.findAll();

    }
}
