package com.daw.esdla.dto;

import com.daw.esdla.model.Raza;

public class AnilloDTO {

    private Long id;
    private String nombre;
    private String portador;
    private Raza raza;
    private String poder;
    private int corrupcion;

    public AnilloDTO() {
    }

    public AnilloDTO(Long id, String nombre, String portador,
                     Raza raza, String poder, int corrupcion) {
        this.id = id;
        this.nombre = nombre;
        this.portador = portador;
        this.raza = raza;
        this.poder = poder;
        this.corrupcion = corrupcion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPortador() {
        return portador;
    }

    public Raza getRaza() {
        return raza;
    }

    public String getPoder() {
        return poder;
    }

    public int getCorrupcion() {
        return corrupcion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPortador(String portador) {
        this.portador = portador;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void setCorrupcion(int corrupcion) {
        this.corrupcion = corrupcion;
    }
}
