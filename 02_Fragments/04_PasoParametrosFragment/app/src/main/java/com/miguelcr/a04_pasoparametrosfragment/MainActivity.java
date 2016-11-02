package com.miguelcr.a04_pasoparametrosfragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment f = new FragmentoGenerico();
        Bundle args = new Bundle();
        args.putString(Constantes.ARG_TITULO_FRAGMENT,"Listado");

        // Vincular el Bundle al Fragment
        f.setArguments(args);

        // Cargar en el container el FragmentoGenerico
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container,f)
                .commit();
    }

    public void cambiarFragment(View view) {

        Fragment f = new FragmentoGenerico();
        Bundle args = new Bundle();

        switch (view.getId()) {
            case R.id.button:
                args.putString(Constantes.ARG_TITULO_FRAGMENT,"Listado");
                break;
            case R.id.button2:
                args.putString(Constantes.ARG_TITULO_FRAGMENT,"Detalle");
                break;
            case R.id.button3:
                args.putString(Constantes.ARG_TITULO_FRAGMENT,"Configuración");
                break;

        }

        // Vincular el Bundle al Fragment
        f.setArguments(args);

        // Cargar en el container el FragmentoGenerico
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,f)
                .commit();
    }
}
