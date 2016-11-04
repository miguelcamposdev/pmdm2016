package com.miguelcr.a02_parceler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {
    Alumno alumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alumno = new Alumno("Pepe",25);
    }

    public void enviarDatos(View view) {
        Intent i = new Intent(this, DetalleActivity.class);
        //TODO: i.putExtra...

        // Si no utiliza
        //i.putExtra("nombre",alumno.getNombre());
        //i.putExtra("edad",alumno.getEdad());
        i.putExtra("alumno", Parcels.wrap(alumno));
        startActivity(i);
    }
}
