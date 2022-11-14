/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USUARIO
 */
public class FormacionAcademica {
private int id;
private String fechaInicio;
private NivelEducativo nivelEdfucativo;
private Universidad universidad;
private EstadoFormacion estadoFormacion;
    public FormacionAcademica() {
    }
    public FormacionAcademica(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public NivelEducativo getNivelEdfucativo() {
        return nivelEdfucativo;
    }

    public void setNivelEdfucativo(NivelEducativo nivelEdfucativo) {
        this.nivelEdfucativo = nivelEdfucativo;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public EstadoFormacion getEstadoFormacion() {
        return estadoFormacion;
    }

    public void setEstadoFormacion(EstadoFormacion estadoFormacion) {
        this.estadoFormacion = estadoFormacion;
    }

}
