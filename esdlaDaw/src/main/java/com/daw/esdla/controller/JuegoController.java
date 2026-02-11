package com.daw.esdla.controller;

import com.daw.esdla.dto.JuegoDTO;
import com.daw.esdla.dto.PartidaDTO;
import com.daw.esdla.service.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class JuegoController {

    @Autowired
    JuegoService juegoService;

    @GetMapping("/api/obtenerPregunta/{id}")
    public ResponseEntity<JuegoDTO> obtenerPregunta(@PathVariable Long id){

        JuegoDTO pregunta = juegoService.obtenerPregunta(id);

        return ResponseEntity.ok(pregunta);
    }

    @GetMapping("/api/respuesta/{id}/")
    public ResponseEntity<Boolean> comprobarRespuesta(
            @PathVariable Long id,
            @RequestParam int respuestaUsuario){

        boolean esCorrecta = juegoService.obtenerRespuesta(id, respuestaUsuario);

        return ResponseEntity.ok(esCorrecta);
    }


    @GetMapping("/api/respuestaMejorada/{id}/{idPartida}")
    public ResponseEntity<PartidaDTO> comprobarRespuestaActualizaPartida(
            @PathVariable Long id, @PathVariable Long idPartida,
            @RequestParam int respuestaUsuario){

        PartidaDTO partidaDTO = juegoService.obtenerRespuestaMejorada(id,idPartida, respuestaUsuario);

        return ResponseEntity.ok(partidaDTO);
    }


}
