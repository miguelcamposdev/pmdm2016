package com.miguelcr.a07_ciclovidaactivity;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView texto;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById(R.id.text_view);

        Log.i("CV","CV: entra en onCreate");
    }

    public void incrementarNumero(View view) {
        texto.setText(String.valueOf(++contador));

        Log.i("CV","CV: entra en incrementarNumero");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CV","CV: entra en onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CV","CV: entra en onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CV","CV: entra en onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CV","CV: entra en onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CV","CV: entra en onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CV","CV: entra en onPause");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i("CV","CV: entra en onConfigurationChange");
    }
}
