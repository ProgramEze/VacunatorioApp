package com.ezequieldiaz.vacunatorioapp.model;

public class Tutor {
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private Relacion relacion;

    public Tutor() {
    }

    public Tutor(int id, String dni, String nombre, String apellido, String telefono, String email, Relacion relacion) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.relacion = relacion;
    }

    public Tutor(String dni, String nombre, String apellido, String telefono, String email, Relacion relacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.relacion = relacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Relacion getRelacion() {
        return relacion;
    }

    public void setRelacion(Relacion relacion) {
        this.relacion = relacion;
    }

    public enum Relacion {
        MADRE,
        PADRE,
        TUTOR,
        OTRO
    }
}