package com.daw.esdla.dto;

import java.time.LocalDateTime;

public class PartidaDTO {

    private Long id;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private int numeroCorrectas;

    public PartidaDTO() {
    }

    public PartidaDTO(Long id, LocalDateTime fechaInicio, LocalDateTime fechaFin, int numeroCorrectas) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numeroCorrectas = numeroCorrectas;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNumeroCorrectas() {
        return numeroCorrectas;
    }

    public void setNumeroCorrectas(int numeroCorrectas) {
        this.numeroCorrectas = numeroCorrectas;
    }
}