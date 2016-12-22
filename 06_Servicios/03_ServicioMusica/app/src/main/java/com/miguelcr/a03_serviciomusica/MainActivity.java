package com.miguelcr.a03_serviciomusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = new Intent(this,ServicioMusica.class);
    }

    public void reproducirCancion(View view) {

        //TODO: pasar una URL de una canción de Internet en mp3
        i.putExtra("urlCancion","");
        startService(i);
    }
}
