package com.miguelcr.maps;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by miguelcampos on 8/12/16.
 */

public class Jugador {
    private String nombre;
    private int goles;
    private LatLng posicion;
    private String foto;

    public Jugador(String nombre, int goles, LatLng posicion, String foto) {
        this.nombre = nombre;
        this.goles = goles;
        this.posicion = posicion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public LatLng getPosicion() {
        return posicion;
    }

    public void setPosicion(LatLng posicion) {
        this.posicion = posicion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
