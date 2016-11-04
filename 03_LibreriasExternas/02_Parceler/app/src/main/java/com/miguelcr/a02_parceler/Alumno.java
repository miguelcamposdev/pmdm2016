package com.miguelcr.a02_parceler;

import org.parceler.Parcel;

import java.io.Serializable;

/**
 * Created by miguelcampos on 3/11/16.
 */

// Las 3 condiciones para que el POJO pueda ser utilizado son:
    // 1) Que tenga la anotación @Parcel
    // 2) Que haya un constructor vacío
    // 3) que los atributos sean públicos


@Parcel
public class Alumno {
    String nombre;
    int edad;

    public Alumno() {
    }

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
