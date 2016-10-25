package com.miguelcr.a03_fragmentsdinamicos;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.miguelcr.a03_fragmentsdinamicos.fragments.DetalleUsuarioFragment;
import com.miguelcr.a03_fragmentsdinamicos.fragments.MenuUsuariosFragment;

public class MainActivity extends AppCompatActivity {
    Fragment f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Con la siguiente línea de código vamos a cargar
        // en el FrameLayout cuyo id es R.id.container
        // el Fragment > MenuUsuariosFragment

        f = new MenuUsuariosFragment();
        getSupportFragmentManager().beginTransaction()
                .add(
                        R.id.container,
                        f
                ).commit();
    }

    public void cambiarFragment(View view) {
        // En lugar de cargar contenido en el container,
        // debemos reemplazarlo, por eso utilizamos la función
        // "replace", en lugar de "add"
        // y en el 2º parámetro le pasamos una instancia del Fragment
        // que queremos visualizar.

        if(f instanceof DetalleUsuarioFragment) {
            f = new MenuUsuariosFragment();
        } else if(f instanceof MenuUsuariosFragment) {
            f = new DetalleUsuarioFragment();
        }

        getSupportFragmentManager().beginTransaction()
                .replace(
                        R.id.container,
                        f
                ).commit();
    }
}
