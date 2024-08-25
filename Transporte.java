/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transporte;

/**
 *
 * @author USUARIO
 */
public class Transporte {
String PesoPaquete; 
String IdPaquete;
String Origen;
String Destino;
String TipoPaquete; //Saber si es liquida, paletizada, peligrosa

    public Transporte(String PesoPaquete, String IdPaquete, String Origen, String Destino, String TipoPaquete) {
        this.PesoPaquete = PesoPaquete;
        this.IdPaquete = IdPaquete;
        this.Origen = Origen;
        this.Destino = Destino;
        this.TipoPaquete = TipoPaquete;
    }

    public Transporte() {
    }

    public String getPesoPaquete() {
        return PesoPaquete;
    }

    public void setPesoPaquete(String PesoPaquete) {
        this.PesoPaquete = PesoPaquete;
    }

    public String getIdPaquete() {
        return IdPaquete;
    }

    public void setIdPaquete(String IdPaquete) {
        this.IdPaquete = IdPaquete;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getTipoPaquete() {
        return TipoPaquete;
    }

    public void setTipoPaquete(String TipoPaquete) {
        this.TipoPaquete = TipoPaquete;
    }
 
    }

