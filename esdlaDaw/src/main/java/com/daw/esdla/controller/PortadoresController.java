package com.daw.esdla.controller;


import com.daw.esdla.dto.PersonajeDTO;
import com.daw.esdla.dto.PortadorAnilloDTO;
import com.daw.esdla.service.PortadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PortadoresController {

    @Autowired
    PortadoresService portadoresService;

    @GetMapping("/api/listaPortadores")
    public List<PortadorAnilloDTO> listar() {
        return portadoresService.findAll();
    }

}
