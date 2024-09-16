package com.ezequieldiaz.vacunatorioapp.model;

import java.io.Serializable;

public class Agente implements Serializable {
    private int matricula;
    private String clave;
    private String nombre;
    private String apellido;
    private String email;
    private boolean estado;

    public Agente() {
    }

    public Agente(int matricula, String clave, String nombre, String apellido, String email, boolean estado) {
        this.matricula = matricula;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.estado = estado;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre;
    }
}