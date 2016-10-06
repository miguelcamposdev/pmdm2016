package com.miguelcr.a04_activityforresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CamaraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camara);

    }

    // Este método Toma la foto y envía la respuesta
    public void enviarFotoRespuesta(View view) {
        // No vamos a tomar la foto, pero podemos pasar
        // en la respuesta una referencia a una imagen que
        // tengamos en el proyecto

        // 1. Definimos un Intent para lanzar la respuesta
        Intent i = new Intent();

        // 2. (Opcional) podemos devolver información en el
        // intent (parámetros, extras)
        i.putExtra("foto",R.drawable.ic_bananas);

        // 3. Devolvemos el resultado, indicando
        //

            setResult(Activity.RESULT_OK, i);

        // 4. Destruimos el activity actual
        finish();
    }

    @Override
    public void onBackPressed() {
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}
