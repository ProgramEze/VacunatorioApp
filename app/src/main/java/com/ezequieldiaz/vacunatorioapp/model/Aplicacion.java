package com.ezequieldiaz.vacunatorioapp.model;

import java.io.Serializable;

public class Aplicacion implements Serializable {
    private int id;
    private int loteProveedorId;
    private int agenteId;
    private int dosis;
    private Estado estado;
    private LoteProveedor loteProveedor;
    private Agente agente;

    public Aplicacion() {
    }

    public Aplicacion(int loteProveedorId, int agenteId, int dosis, Estado estado, LoteProveedor loteProveedor, Agente agente) {
        this.loteProveedorId = loteProveedorId;
        this.agenteId = agenteId;
        this.dosis = dosis;
        this.estado = estado;
        this.loteProveedor = loteProveedor;
        this.agente = agente;
    }

    public Aplicacion(int id, int loteProveedorId, int agenteId, int dosis, Estado estado, LoteProveedor loteProveedor, Agente agente) {
        this.id = id;
        this.loteProveedorId = loteProveedorId;
        this.agenteId = agenteId;
        this.dosis = dosis;
        this.estado = estado;
        this.loteProveedor = loteProveedor;
        this.agente = agente;
    }

    public Aplicacion(int loteProveedorId, int agenteId, int dosis, Estado estado) {
        this.loteProveedorId = loteProveedorId;
        this.agenteId = agenteId;
        this.dosis = dosis;
        this.estado = estado;
    }

    public Aplicacion(int id, int loteProveedorId, int agenteId, int dosis, Estado estado) {
        this.id = id;
        this.loteProveedorId = loteProveedorId;
        this.agenteId = agenteId;
        this.dosis = dosis;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLoteProveedorId() {
        return loteProveedorId;
    }

    public void setLoteProveedorId(int loteProveedorId) {
        this.loteProveedorId = loteProveedorId;
    }

    public int getAgenteId() {
        return agenteId;
    }

    public void setAgenteId(int agenteId) {
        this.agenteId = agenteId;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public LoteProveedor getLoteProveedor() {
        return loteProveedor;
    }

    public void setLoteProveedor(LoteProveedor loteProveedor) {
        this.loteProveedor = loteProveedor;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public enum Estado{
        PENDIENTE,
        APLICADA,
        CANCELADA
    }
}
