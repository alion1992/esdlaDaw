package com.daw.esdla.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "portadores_anillos")
public class PortadorAnillo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "personaje_id")
    private Personaje personaje;

    @ManyToOne(optional = false)
    @JoinColumn(name = "anillo_id")
    private Anillo anillo;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    @Column(nullable = false)
    private boolean activo;

    public PortadorAnillo() {
    }

    public PortadorAnillo(
            Personaje personaje,
            Anillo anillo,
            LocalDate fechaInicio,
            LocalDate fechaFin,
            boolean activo
    ) {
        this.personaje = personaje;
        this.anillo = anillo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Anillo getAnillo() {
        return anillo;
    }

    public void setAnillo(Anillo anillo) {
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
}