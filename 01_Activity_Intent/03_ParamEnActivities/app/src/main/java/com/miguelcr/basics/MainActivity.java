package com.miguelcr.basics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewNombre, textViewApellidos, textViewEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNombre = (TextView) findViewById(R.id.text_username);
        textViewApellidos = (TextView) findViewById(R.id.text_apellidos);
        textViewEdad = (TextView) findViewById(R.id.text_edad);


        Intent i = getIntent();
        Bundle parametros = i.getExtras();
        String usuario = parametros.getString(Constantes.EXTRA_USERNAME);
        int edadUsuario = parametros.getInt(Constantes.EXTRA_EDAD);
        String apellidos = parametros.getString(Constantes.EXTRA_APELLIDOS);

        int jubilacion = 67-edadUsuario;

        textViewNombre.setText(usuario);
        textViewApellidos.setText(apellidos);
        textViewEdad.setText("Años para jubilarte "+String.valueOf(jubilacion));



    }
}
