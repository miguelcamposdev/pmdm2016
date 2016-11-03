package com.miguelcr.a02_parceler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {
    TextView textViewNombre, textViewEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        textViewNombre = (TextView) findViewById(R.id.text_view_nombre);
        textViewEdad = (TextView) findViewById(R.id.text_view_edad);

        Bundle extras = getIntent().getExtras();

        //TODO

    }
}
