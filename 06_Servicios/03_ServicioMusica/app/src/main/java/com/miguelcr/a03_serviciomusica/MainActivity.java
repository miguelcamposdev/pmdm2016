package com.miguelcr.a03_serviciomusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent i;
    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = new Intent(this,ServicioMusica.class);
    }

    public void reproducirCancion(View view) {


        //TODO: pasar una URL de una canción de Internet en mp3
        i.putExtra("urlCancion","http://dl.mp3xd.eu/xd/4JmrOWpke5qk9coU+aapSqmtmm5/Justin+bieber+what+do+you+mean.mp3");
        startService(i);
    }
}
