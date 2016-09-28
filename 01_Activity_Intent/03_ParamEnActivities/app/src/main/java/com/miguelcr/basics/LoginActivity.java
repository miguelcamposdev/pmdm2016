package com.miguelcr.basics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextUsername, editTextApellidos, editTextEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = (EditText) findViewById(R.id.edit_text_username);
        editTextApellidos = (EditText) findViewById(R.id.edit_text_apellidos);
        editTextEdad = (EditText) findViewById(R.id.edit_text_edad);
    }

    public void onClickLogin(View view) {
        Log.i("EVENTO","Click en botón login >>> onClickLogin");

        Intent i = new Intent(this,MainActivity.class);
        // en el método putExtra enviamos (nombre_variable,valor)
        i.putExtra(Constantes.EXTRA_USERNAME,editTextUsername.getText().toString());
        i.putExtra(Constantes.EXTRA_APELLIDOS,editTextApellidos.getText().toString());
        i.putExtra(Constantes.EXTRA_EDAD,Integer.parseInt(editTextEdad.getText().toString()));
        startActivity(i);


    }
}
