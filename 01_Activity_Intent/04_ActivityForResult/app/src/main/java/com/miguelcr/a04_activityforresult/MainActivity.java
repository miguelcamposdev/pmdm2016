package com.miguelcr.a04_activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final int TESTIGO_TOMAR_FOTO = 1;
    private static final int TESTIGO_BUSCAR_EN_MAPA = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void takePhoto(View view) {
        Intent i = new Intent(this, CamaraActivity.class);
        startActivityForResult(i,TESTIGO_TOMAR_FOTO);
    }

    public void buscarLocalizacionEnMapa(View view) {
        Intent i = new Intent(this, MapaActivity.class);
        startActivityForResult(i,TESTIGO_BUSCAR_EN_MAPA);
    }

    // requestCode >> testigo que pasé al lanzar el Activity
    // en nuestro caso TESTIGO_TOMAR_FOTO

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == TESTIGO_TOMAR_FOTO) {

        }

    }
}
