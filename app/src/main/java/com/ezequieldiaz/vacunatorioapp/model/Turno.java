package com.ezequieldiaz.vacunatorioapp.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Turno implements Serializable {
    private int id;
    private int pacienteId;
    private int tipoDeVacunaId;
    private int tutorId;
    private int agenteId;
    private int aplicacionId;
    private LocalDateTime cita;
    private Paciente paciente;
    private TipoDeVacuna tipoDeVacuna;
    private Tutor tutor;
    private Agente agente;
    private Aplicacion aplicacion;

    public Turno() {
    }

    public Turno(int id, int pacienteId, int tipoDeVacunaId, int tutorId, int agenteId, int aplicacionId, LocalDateTime cita, Paciente paciente, TipoDeVacuna tipoDeVacuna, Tutor tutor, Agente agente, Aplicacion aplicacion) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.tipoDeVacunaId = tipoDeVacunaId;
        this.tutorId = tutorId;
        this.agenteId = agenteId;
        this.aplicacionId = aplicacionId;
        this.cita = cita;
        this.paciente = paciente;
        this.tipoDeVacuna = tipoDeVacuna;
        this.tutor = tutor;
        this.agente = agente;
        this.aplicacion = aplicacion;
    }

    public Turno(int pacienteId, int tipoDeVacunaId, int tutorId, int agenteId, int aplicacionId, LocalDateTime cita, Paciente paciente, TipoDeVacuna tipoDeVacuna, Tutor tutor, Agente agente, Aplicacion aplicacion) {
        this.pacienteId = pacienteId;
        this.tipoDeVacunaId = tipoDeVacunaId;
        this.tutorId = tutorId;
        this.agenteId = agenteId;
        this.aplicacionId = aplicacionId;
        this.cita = cita;
        this.paciente = paciente;
        this.tipoDeVacuna = tipoDeVacuna;
        this.tutor = tutor;
        this.agente = agente;
        this.aplicacion = aplicacion;
    }

    public Turno(int id, int pacienteId, int tipoDeVacunaId, int tutorId, int agenteId, int aplicacionId, LocalDateTime cita) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.tipoDeVacunaId = tipoDeVacunaId;
        this.tutorId = tutorId;
        this.agenteId = agenteId;
        this.aplicacionId = aplicacionId;
        this.cita = cita;
    }

    public Turno(int pacienteId, int tipoDeVacunaId, int tutorId, int agenteId, int aplicacionId, LocalDateTime cita) {
        this.pacienteId = pacienteId;
        this.tipoDeVacunaId = tipoDeVacunaId;
        this.tutorId = tutorId;
        this.agenteId = agenteId;
        this.aplicacionId = aplicacionId;
        this.cita = cita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }

    public int getTipoDeVacunaId() {
        return tipoDeVacunaId;
    }

    public void setTipoDeVacunaId(int tipoDeVacunaId) {
        this.tipoDeVacunaId = tipoDeVacunaId;
    }

    public int getTutorId() {
        return tutorId;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

    public int getAgenteId() {
        return agenteId;
    }

    public void setAgenteId(int agenteId) {
        this.agenteId = agenteId;
    }

    public int getAplicacionId() {
        return aplicacionId;
    }

    public void setAplicacionId(int aplicacionId) {
        this.aplicacionId = aplicacionId;
    }

    public LocalDateTime getCita() {
        return cita;
    }

    public void setCita(LocalDateTime cita) {
        this.cita = cita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public TipoDeVacuna getTipoDeVacuna() {
        return tipoDeVacuna;
    }

    public void setTipoDeVacuna(TipoDeVacuna tipoDeVacuna) {
        this.tipoDeVacuna = tipoDeVacuna;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public Aplicacion getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }
}