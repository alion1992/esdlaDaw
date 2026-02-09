package com.daw.esdla.service;

import com.daw.esdla.dto.JuegoDTO;
import com.daw.esdla.dto.PartidaDTO;
import com.daw.esdla.model.Juego;
import com.daw.esdla.model.Partida;
import com.daw.esdla.repository.JuegoRepository;
import com.daw.esdla.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class JuegoService {

    @Autowired
    private JuegoRepository juegoRepository;

    @Autowired
    private PartidaRepository partidaRepository;

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

    public PartidaDTO obtenerRespuestaMejorada(Long id, Long idPartida, int respuestaUsuario) {
        Partida partida = partidaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Partida no encontrada con id: " + id));

        Juego juego = juegoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pregunta no encontrada con id: " + id));
        boolean finPartida = true;
        PartidaDTO partidaDto = null;
        if (juego.getRespuestaCorrecta() == respuestaUsuario) {
            partida.setNumeroCorrectas(partida.getNumeroCorrectas() + 1);
            partida = partidaRepository.save(partida);
            partidaDto = new PartidaDTO(
                    partida.getId(),
                    partida.getFechaInicio(),
                    partida.getFechaFin(),
                    partida.getNumeroCorrectas(),
                    true
            );
            if (partida.getNumeroCorrectas() != 5) {
                partidaDto.setFinPartida(false);
            }
        } else {
            partida.setFechaFin(LocalDateTime.now());
            partida = partidaRepository.save(partida);
            partidaDto = new PartidaDTO(
                    partida.getId(),
                    partida.getFechaInicio(),
                    partida.getFechaFin(),
                    partida.getNumeroCorrectas(),
                    true
            );
        }
        return partidaDto;
    }

}

