package com.daw.esdla.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private int numeroCorrectas;

    public Partida() {
    }

    public Partida(LocalDateTime fechaInicio, LocalDateTime fechaFin, int numeroCorrectas) {
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