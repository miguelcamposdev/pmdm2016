package com.miguelcr.a03_serviciomusica;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;

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
        extras.getString("urlCancion");

        reproductorMusica = MediaPlayer.create(this, Uri.parse(""));
        try {
            reproductorMusica.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }

        reproductorMusica.start();

        return START_REDELIVER_INTENT;
    }
}
