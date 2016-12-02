package com.example.servicio;


import com.example.dominio.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class PersonaService {
    @Autowired
    PersonRepository personRepository;

    @Transactional
    public void save(Persona person) {
        if (person.getId() == null) {
            personRepository.persist(person);
        } else {
            personRepository.merge(person);
        }
    }

    public Persona get(Long id) {
        return personRepository.find(id);
    }

    public Collection<Persona> getAll() {
        return personRepository.findAll();
    }
}
