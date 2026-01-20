package com.daw.esdla.model;

import jakarta.persistence.*;

@Entity
@Table(name = "anillos")
public class Anillo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String portador;

    @Enumerated(EnumType.STRING)
    private Raza raza;

    private String poder;

    private int corrupcion;

    public Anillo() {
    }

    public Anillo(String nombre, String portador, Raza raza, String poder, int corrupcion) {
        this.nombre = nombre;
        this.portador = portador;
        this.raza = raza;
        this.poder = poder;
        this.corrupcion = corrupcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPortador() {
        return portador;
    }

    public void setPortador(String portador) {
        this.portador = portador;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getCorrupcion() {
        return corrupcion;
    }

    public void setCorrupcion(int corrupcion) {
        this.corrupcion = corrupcion;
    }
}