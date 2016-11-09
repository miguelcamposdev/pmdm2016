package com.miguelcr.a06_fragmentmultiscreen;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.miguelcr.a06_fragmentmultiscreen.fragments.MenuFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vamos a rescatar el LinearLAyout del activity_main.xml de la tablet
        LinearLayout linearLayoutTablet = (LinearLayout) findViewById(R.id.linear_layout_tablet);

        if(linearLayoutTablet!=null) {
            // Estoy en la tablet
        } else {
            // estoy en un móvil de mano (handset)
            Fragment f = new MenuFragment();

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container,f)
                    .commit();
        }

    }
}
