/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Moon
 */
public class Automovil {
    
    private String numeroRegistro;
    private String nombreDuenio;
    private String cedulaDuenio;
    private String placa;

    public Automovil(String numeroRegistro, String nombreDuenio, String cedulaDuenio, String placa) {
        this.numeroRegistro = numeroRegistro;
        this.nombreDuenio = nombreDuenio;
        this.cedulaDuenio = cedulaDuenio;
        this.placa = placa;
    }

    /**
     * @return the numeroRegistro
     */
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * @param numeroRegistro the numeroRegistro to set
     */
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    /**
     * @return the nombreDuenio
     */
    public String getNombreDuenio() {
        return nombreDuenio;
    }

    /**
     * @param nombreDuenio the nombreDuenio to set
     */
    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    /**
     * @return the cedulaDuenio
     */
    public String getCedulaDuenio() {
        return cedulaDuenio;
    }

    /**
     * @param cedulaDuenio the cedulaDuenio to set
     */
    public void setCedulaDuenio(String cedulaDuenio) {
        this.cedulaDuenio = cedulaDuenio;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
    
}
