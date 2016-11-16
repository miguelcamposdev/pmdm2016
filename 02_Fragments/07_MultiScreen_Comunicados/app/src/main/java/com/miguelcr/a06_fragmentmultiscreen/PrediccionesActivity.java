package com.miguelcr.a06_fragmentmultiscreen;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.miguelcr.a06_fragmentmultiscreen.fragments.DetalleDiaFragment;
import com.miguelcr.a06_fragmentmultiscreen.fragments.DiasPrediccionesFragment;

public class PrediccionesActivity extends AppCompatActivity implements PrediccionesListListener {
    LinearLayout linearLayoutTablet;
    DetalleDiaFragment fragmentDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vamos a rescatar el LinearLAyout del activity_main.xml de la tablet
        linearLayoutTablet = (LinearLayout) findViewById(R.id.linear_layout_tablet);

        if(linearLayoutTablet!=null) {
            // Estoy en la tablet
            fragmentDetalle = (DetalleDiaFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetalle);

        } else {
            // estoy en un móvil de mano (handset)
            Fragment f = new DiasPrediccionesFragment();

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container,f)
                    .commit();
        }

    }

    // En este ejemplo el método onPrediccionClick recibe un String
    // sobre el que se ha hecho click, pero en otro caso, debería ser
    // la clase POJO del elemento de la lista. Por ejemplo si estoy
    // dibujando con el RecyclerView una lista de "Prediccion", siendo
    // "Prediccion" una clase POJO, este método debería recibir un objeto
    // de tipo "Prediccion"

    @Override
    public void onPrediccionClick(String prediccion) {
        if(linearLayoutTablet!=null) { // tablet
            fragmentDetalle.actualizaVistaDetalle(prediccion);
        } else { // móvil
            Intent i = new Intent(this, DetalleDiaActivity.class);
            i.putExtra("dia",prediccion);
            startActivity(i);
        }
    }
}
