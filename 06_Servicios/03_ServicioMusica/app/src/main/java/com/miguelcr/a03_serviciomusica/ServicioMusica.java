package com.miguelcr.a03_serviciomusica;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import java.io.IOException;

public class ServicioMusica extends Service {
    MediaPlayer reproductorMusica;

    public ServicioMusica() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);

        Bundle extras = intent.getExtras();
        String cancion = extras.getString("urlCancion");
        Log.i("***CANCION***","*** Reproduciendo: "+cancion);

        reproductorMusica = MediaPlayer.create(this, Uri.parse(cancion));

        reproductorMusica.start();

        return START_REDELIVER_INTENT;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        reproductorMusica.stop();
        reproductorMusica.release();

    }
}
