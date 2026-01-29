package com.daw.esdla.service;

import com.daw.esdla.dto.PersonajeDTO;
import com.daw.esdla.mapper.PersonajeMapper;
import com.daw.esdla.model.Personaje;
import com.daw.esdla.model.Raza;
import com.daw.esdla.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;
    @Autowired
    private DataSource dataSource;

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

    public PersonajeDTO insertarPersonaje(PersonajeDTO dto) {
        Personaje personaje = new Personaje(null,dto.getNombre(), Raza.valueOf(dto.getRaza()),dto.getFechaNacimiento(),dto.getNivelCorrupcion());
        personaje = personajeRepository.save(personaje);
        dto.setId(personaje.getId());
        return dto;
    }

    public PersonajeDTO actualizarPersonaje(Long id, PersonajeDTO dto) {

        Personaje personaje = personajeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Personaje no encontrado"));

        personaje.setNombre(dto.getNombre());
        personaje.setRaza(Raza.valueOf(dto.getRaza()));
        personaje.setFechaNacimiento(dto.getFechaNacimiento());
        personaje.setNivelCorrupcion(dto.getNivelCorrupcion());

        personaje = personajeRepository.save(personaje);

        dto.setId(personaje.getId());
        return dto;
    }

    public PersonajeDTO bajaLogicaPersonaje(Long id) {
        Personaje personaje = personajeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Personaje no encontrado"));
        personaje.setFechaBaja(new Date());
        personajeRepository.save(personaje);
        return PersonajeMapper.map(personaje);

    }

    public void bajaFisica(Long id) {
        personajeRepository.deleteById(id);
    }

    public PersonajeDTO reactivarPersonaje(Long id) {
        Personaje personaje = personajeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Personaje no encontrado"));
        personaje.setFechaBaja(null);
        personajeRepository.save(personaje);
        return PersonajeMapper.map(personaje);
    }
}
