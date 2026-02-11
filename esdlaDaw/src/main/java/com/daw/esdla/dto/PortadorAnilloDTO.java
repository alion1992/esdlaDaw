package com.daw.esdla.dto;

import java.time.LocalDate;

public class PortadorAnilloDTO {

    private Long id;

    private PersonajeDTO personaje;
    private AnilloDTO anillo;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean activo;

    public PortadorAnilloDTO() {
    }

    public PortadorAnilloDTO(Long id,
                             PersonajeDTO personaje,
                             AnilloDTO anillo,
                             LocalDate fechaInicio,
                             LocalDate fechaFin,
                             boolean activo) {
        this.id = id;
        this.personaje = personaje;
        this.anillo = anillo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public PersonajeDTO getPersonaje() {
        return personaje;
    }

    public void setPersonaje(PersonajeDTO personaje) {
        this.personaje = personaje;
    }

    public AnilloDTO getAnillo() {
        return anillo;
    }

    public void setAnillo(AnilloDTO anillo) {
        this.anillo = anillo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
