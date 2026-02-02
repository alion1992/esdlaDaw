package com.daw.esdla.dto;


import java.time.LocalDate;
import java.util.Date;

public class PersonajeDTO {

    private Long id;
    private String nombre;
    private String raza;
    private LocalDate fechaNacimiento;
    private int nivelCorrupcion;
    private Date fechaBaja;

    public PersonajeDTO() {
    }

    public PersonajeDTO(
            Long id,
            String nombre,
            String raza,
            LocalDate fechaNacimiento,
            int nivelCorrupcion,
            Date fechaBaja
    ) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.nivelCorrupcion = nivelCorrupcion;
        this.fechaBaja = fechaBaja;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
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

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}


