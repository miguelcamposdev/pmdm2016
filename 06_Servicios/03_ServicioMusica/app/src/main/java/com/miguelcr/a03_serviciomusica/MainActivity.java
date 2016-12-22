package com.miguelcr.a03_serviciomusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import co.mobiwise.library.MusicPlayerView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Intent i;
    MusicPlayerView musicPlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musicPlayerView = (MusicPlayerView) findViewById(R.id.mpv);
        musicPlayerView.setOnClickListener(this);
        musicPlayerView.setAutoProgress(true);
        musicPlayerView.setCoverURL("http://cdn.mos.musicradar.com/images/magblogs/computer-music/cm-wallpapers/CMU152cover1920x1200.jpg");

        i = new Intent(this,ServicioMusica.class);
    }

    @Override
    public void onClick(View view) {
        if(musicPlayerView.isRotating()) {
            stopService(i);

            // La siguiente línea de código para la rotación de la carátula
            musicPlayerView.stop();
        } else {
            musicPlayerView.start();
            //TODO: pasar una URL de una canción de Internet en mp3
            i.putExtra("urlCancion", "http://dl.mp3xd.eu/xd/4JmrOWpke5qk9coU+aapSqmtmm5/Justin+bieber+what+do+you+mean.mp3");
            startService(i);
        }

    }
}
