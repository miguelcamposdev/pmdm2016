package com.miguelcr.a02_checkinternet;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // MUY IMPORTANTE
        // Mirad en el AndroidManifest.xml los permisos que he añadido

        if(checkInternet(this)) {
            // Si tengo internet hacer aquí lo que sea.
            // No hay que controlar el else por el método checkInternet ya gestiona
            // el caso de que no haya internet.
        }
    }

    public boolean checkInternet(Context ctx) {
        AlertDialog.Builder builder;

        boolean bandera = true;
        ConnectivityManager conMgr = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo i = conMgr.getActiveNetworkInfo();
        if (i == null || !i.isConnected() || !i.isAvailable()) {
            builder = new AlertDialog.Builder(ctx);

            builder.setTitle(ctx.getString(R.string.if_conection));
            builder.setMessage(ctx.getString(R.string.activation_internet));
            builder.setCancelable(false);

            builder.setPositiveButton(ctx.getString(R.string.yes),
                    new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Lanzo un intent implícito que hace que se abra
                            // la pantalla de Configuración del móvil
                            // para que el usuario se conecte a Internet
                            // Internet
                            Intent intent = new Intent(
                                    Settings.ACTION_SETTINGS);

                            startActivity(intent);
                        }
                    });


            builder.setNegativeButton(ctx.getString(R.string.cancel),
                    new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });

            builder.create();
            builder.show();
            bandera = false;
        }

        return bandera;

    }
}
