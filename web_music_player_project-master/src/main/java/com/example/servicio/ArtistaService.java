package com.example.servicio;

import com.example.dominio.Artista;
import com.example.repositorio.ArtistaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class ArtistaService {
    @Autowired
    ArtistaRepositorio artistRepository;

    @Transactional
    public void save(Artista artist) {
        if (artist.getId() == null) {
            artistRepository.persist(artist);
        } else {
            artistRepository.merge(artist);
        }
    }

    public Artista get(Long id) {
        return artistRepository.find(id);
    }


    public Collection<Artista> getAll() {
        return artistRepository.findAll();
    }
}
