package com.miguelcr.a04_notificacion;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationCompat.Builder mBuilder;
    NotificationManager mNotificationManager;
    public static final int ID_NOTIFICACION_REPRODUCTOR = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarNotificacion(View view) {
        // Definimos las propiedades de la Notificación
        mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(android.R.drawable.ic_media_ff) // Icono
                        //.setOngoing(true) // Con esta opción no se puede cancelar la notificación
                        .setContentTitle("Escuchando... Baby") // Título
                        .setContentText("Justin Bieber"); // Descripción

        // Gestionamos la pila de navegación del sistema operativo
        // Activity que se lanza cuando click en la Notificación

        Intent resultIntent = new Intent(this, MainActivity.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);

        // Activity desde el que se lanza la Notificación
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(
                        0,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        // fin gestión pila navegación

        mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        // La siguiente línea de código es la responsable de mostrar
        // la notificación en el statusBar.
        mNotificationManager.notify(ID_NOTIFICACION_REPRODUCTOR, mBuilder.build());

    }

    public void ocultarNotificacion(View view) {
        mNotificationManager.cancel(ID_NOTIFICACION_REPRODUCTOR);
    }
}
