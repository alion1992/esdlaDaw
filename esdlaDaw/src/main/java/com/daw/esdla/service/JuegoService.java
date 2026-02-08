package com.daw.esdla.service;

import com.daw.esdla.dto.JuegoDTO;
import com.daw.esdla.model.Juego;
import com.daw.esdla.repository.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegoService {

    @Autowired
    private JuegoRepository juegoRepository;

    public JuegoDTO obtenerPregunta(Long id) {

        Juego juego = juegoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pregunta no encontrada con id: " + id));

        return new JuegoDTO(
                juego.getId(),
                juego.getPregunta(),
                juego.getRespuesta1(),
                juego.getRespuesta2(),
                juego.getRespuesta3(),
                juego.getRespuesta4(),
                juego.getRespuestaCorrecta()
        );
    }

    public boolean obtenerRespuesta(Long id, int respuestaUsuario) {

        Juego juego = juegoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pregunta no encontrada con id: " + id));

        return juego.getRespuestaCorrecta() == respuestaUsuario;
    }
}
