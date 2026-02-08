package com.daw.esdla.controller;


import com.daw.esdla.dto.PartidaDTO;
import com.daw.esdla.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class PartidaController {

    @Autowired
    PartidaService partidaService;

    @GetMapping("/api/obtenerPartida/{id}")
    public ResponseEntity<PartidaDTO> obtenerPartida(@PathVariable Long id) {

        PartidaDTO partida = partidaService.obtenerPartida(id);

        return ResponseEntity.ok(partida);
    }

    @PutMapping("/api/correcta/{id}/")
    public ResponseEntity<PartidaDTO> actualizarCorrectas(@PathVariable Long id) {

        PartidaDTO partidaActualizada = partidaService.actualizarCorrectas(id);

        return ResponseEntity.ok(partidaActualizada);
    }

    @PutMapping("/api/derrota/{id}/")
    public ResponseEntity<PartidaDTO> derrotaPartida(@PathVariable Long id) {

        PartidaDTO partidaFinalizada = partidaService.derrotaPartida(id);

        return ResponseEntity.ok(partidaFinalizada);
    }



}
