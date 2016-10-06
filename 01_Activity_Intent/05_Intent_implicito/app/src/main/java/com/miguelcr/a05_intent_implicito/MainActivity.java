package com.miguelcr.a05_intent_implicito;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPhone = (EditText) findViewById(R.id.edit_text_phone);

    }

    public void llamarPorTelefono(View view) {
        // Aquí tenemos que lanzar el Intent implícito
        // es decir, que no vamos a llamar a ningún
        // Activity en concreto sino que vamos a indicar
        // que queremos llamar por teléfono a un número
        // si el usuario tiene instaladas para apps
        // que gestionan llamadas de teléfono, aparecerá
        // un cuadro de diálogo el listado de apps
        // y el usuario decidirá con cuál quiere llamar
        // p.e.: Dial de Android, Whatsapp, Skype,...
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + editTextPhone.getText()));

        // Con la siguiente comprobación, sabemos si el usuario le ha
        // dado a nuestra app permiso para llamar por teléfono
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(intent);
    }
}
