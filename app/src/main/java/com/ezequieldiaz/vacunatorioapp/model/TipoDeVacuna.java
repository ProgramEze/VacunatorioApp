package com.ezequieldiaz.vacunatorioapp.model;

import java.io.Serializable;

public class TipoDeVacuna implements Serializable {
    private int id;
    private String nombre;
    private String descripcion;


    public TipoDeVacuna() {
    }

    public TipoDeVacuna(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public TipoDeVacuna(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
