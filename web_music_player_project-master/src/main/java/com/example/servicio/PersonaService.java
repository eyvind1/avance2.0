package com.example.servicio;



import com.example.dominio.Person;
import com.example.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class PersonaService {
    @Autowired
    PersonaRepositorio personRepository;

    @Transactional
    public void save(Person person) {
        if (person.getId() == null) {
            personRepository.persist(person);
        } else {
            personRepository.merge(person);
        }
    }

    public Person get(Integer id) {
        return personRepository.find(id);
    }

    public Collection<Person> getAll() {
        return personRepository.findAll();
    }
}
