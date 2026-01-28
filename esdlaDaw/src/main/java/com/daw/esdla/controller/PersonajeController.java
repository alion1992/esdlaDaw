package com.daw.esdla.controller;

import com.daw.esdla.dto.PersonajeDTO;
import com.daw.esdla.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @PutMapping("/api/bajaLogica/{id}")
    public PersonajeDTO bajaLogicaPersonaje(
            @PathVariable Long id) {
        return personajeService.bajaLogicaPersonaje(id);
    }

    @DeleteMapping("/api/bajaFisica/{id}")
    public ResponseEntity<Map<String, String>> bajaFisicaPersonaje(
            @PathVariable Long id) {
        try{
            personajeService.bajaFisica(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            Map<String, String> error = new HashMap<>();
            error.put("error", "No se pudo eliminar el personaje");
            error.put("detalle", e.getMessage());

            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(error);
        }


    }
}
