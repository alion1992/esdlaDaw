package com.daw.esdla.controller;

import com.daw.esdla.dto.PersonajeDTO;
import com.daw.esdla.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;


    @GetMapping("/api/listaPersonajes")
    public List<PersonajeDTO> listar() {
        return personajeService.findAll();
    }

    @GetMapping("/api/obtenerPersonaje/{id}")
    public PersonajeDTO obtenerJugador(@PathVariable("id") Long id){
        return personajeService.obtenerPersonaje(id);
    }

    @PostMapping("/api/insertarPersonaje")
    public PersonajeDTO insertarProducto(@RequestBody PersonajeDTO dto){
        return personajeService.insertarPersonaje(dto);
    }

    @PutMapping("/api/actualizarPersonaje/{id}")
    public PersonajeDTO actualizarPersonaje(
            @PathVariable Long id,
            @RequestBody PersonajeDTO dto) {
        return personajeService.actualizarPersonaje(id, dto);
    }

}
