package com.daw.esdla.service;

import com.daw.esdla.dto.AnilloDTO;
import com.daw.esdla.dto.PersonajeDTO;
import com.daw.esdla.dto.PortadorAnilloDTO;
import com.daw.esdla.repository.PortadoresRepository;
import org.hibernate.annotations.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortadoresService {

    @Autowired
    PortadoresRepository portadorAnilloRepository;

    public List<PortadorAnilloDTO> findAll() {

        return portadorAnilloRepository.findAll()
                .stream()
                .map(pa -> new PortadorAnilloDTO(
                        pa.getId(),

                        new PersonajeDTO(
                                pa.getPersonaje().getId(),
                                pa.getPersonaje().getNombre(),
                                pa.getPersonaje().getRaza().toString(),
                                pa.getPersonaje().getFechaNacimiento(),
                                pa.getPersonaje().getNivelCorrupcion(),
                                pa.getPersonaje().getFechaBaja()
                        ),

                        new AnilloDTO(
                                pa.getAnillo().getId(),
                                pa.getAnillo().getNombre(),
                                pa.getAnillo().getPortador(),
                                pa.getAnillo().getRaza(),
                                pa.getAnillo().getPoder(),
                                pa.getAnillo().getCorrupcion()
                        ),

                        pa.getFechaInicio(),
                        pa.getFechaFin(),
                        pa.isActivo()
                ))
                .toList();
    }


}
