package com.daw.esdla.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "personajes")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Raza raza;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "nivel_corrupcion")
    private int nivelCorrupcion;

    public Personaje() {
    }

    public Personaje(String nombre, Raza raza, LocalDate fechaNacimiento, int nivelCorrupcion) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.nivelCorrupcion = nivelCorrupcion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNivelCorrupcion() {
        return nivelCorrupcion;
    }

    public void setNivelCorrupcion(int nivelCorrupcion) {
        this.nivelCorrupcion = nivelCorrupcion;
    }
}