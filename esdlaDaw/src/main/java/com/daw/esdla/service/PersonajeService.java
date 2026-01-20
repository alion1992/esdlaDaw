package com.daw.esdla.service;

import com.daw.esdla.dto.PersonajeDTO;
import com.daw.esdla.model.Personaje;
import com.daw.esdla.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    public List<PersonajeDTO> findAll() {
        return personajeRepository.findAll()
                .stream()
                .map(u -> new PersonajeDTO(u.getId(),u.getNombre(),u.getRaza().toString(),u.getFechaNacimiento(),u.getNivelCorrupcion()))
                .toList();
    }

    public PersonajeDTO obtenerPersonaje(Long id) {
        Personaje personaje = personajeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Personaje no encontrado"));
        return new PersonajeDTO(
                personaje.getId(),
                personaje.getNombre(),
                personaje.getRaza().toString(),
                personaje.getFechaNacimiento(),
                personaje.getNivelCorrupcion()

        );
    }
}
