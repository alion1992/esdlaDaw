package com.daw.esdla.mapper;

import com.daw.esdla.dto.PersonajeDTO;
import com.daw.esdla.model.Personaje;
import com.daw.esdla.model.Raza;

public class PersonajeMapper {

    public static Personaje map(PersonajeDTO dto) {
        if (dto == null) return null;

        Personaje personaje = new Personaje();

        personaje.setNombre(dto.getNombre());
        personaje.setFechaNacimiento(dto.getFechaNacimiento());
        personaje.setNivelCorrupcion(dto.getNivelCorrupcion());

        personaje.setRaza(parseRaza(dto.getRaza()));

        return personaje;
    }

    private static Raza parseRaza(String raza) {
        if (raza == null) return null;

        try {
            return Raza.valueOf(raza.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Raza no válida: " + raza);
        }
    }

    public static PersonajeDTO map(Personaje personaje) {
        if (personaje == null) return null;

        PersonajeDTO dto = new PersonajeDTO();

        dto.setNombre(personaje.getNombre());
        dto.setFechaNacimiento(personaje.getFechaNacimiento());
        dto.setNivelCorrupcion(personaje.getNivelCorrupcion());
        dto.setRaza(personaje.getRaza() != null ? personaje.getRaza().name() : null
        );
        dto.setId(personaje.getId());
        if(null != personaje.getFechaBaja())dto.setFechaBaja(personaje.getFechaBaja());

        return dto;
    }

}
