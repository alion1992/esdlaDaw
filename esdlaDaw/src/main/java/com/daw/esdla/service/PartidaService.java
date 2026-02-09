package com.daw.esdla.service;

import com.daw.esdla.dto.PartidaDTO;
import com.daw.esdla.model.Partida;
import com.daw.esdla.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public class PartidaService {

    @Autowired
    private PartidaRepository partidaRepository;

    public PartidaDTO obtenerPartida(Long id) {

        Partida partida = partidaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Partida no encontrada con id: " + id));

        return new PartidaDTO(
                partida.getId(),
                partida.getFechaInicio(),
                partida.getFechaFin(),
                partida.getNumeroCorrectas()
        );
    }

    public PartidaDTO actualizarCorrectas(Long id){
        Partida partida = partidaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Partida no encontrada con id: " + id));
        partida.setNumeroCorrectas(partida.getNumeroCorrectas()+1);
        partida = partidaRepository.save(partida);
        return new PartidaDTO(
                partida.getId(),
                partida.getFechaInicio(),
                partida.getFechaFin(),
                partida.getNumeroCorrectas()
        );

    }

    public PartidaDTO derrotaPartida(Long id){
        Partida partida = partidaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Partida no encontrada con id: " + id));
        partida.setFechaFin(LocalDateTime.now());
        partida = partidaRepository.save(partida);
        return new PartidaDTO(
                partida.getId(),
                partida.getFechaInicio(),
                partida.getFechaFin(),
                partida.getNumeroCorrectas()
        );
    }

    public PartidaDTO empezarPartida(){
        Partida partida = new Partida(LocalDateTime.now(),null,0);
        partida = partidaRepository.save(partida);
        return new PartidaDTO(
                partida.getId(),
                partida.getFechaInicio(),
                partida.getFechaFin(),
                partida.getNumeroCorrectas()
        );
    }
}
