package com.miguelcr.a06_fragmentmultiscreen.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.miguelcr.a06_fragmentmultiscreen.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiasPrediccionesFragment extends Fragment {

    public DiasPrediccionesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_menu, container, false);

        // Aquí tendría que tener un RecyclerView
        // Con un adapter y dentro del adapter el evento click sobre un elemento
        // de la lista, que invoca a un método de la interfaz que es implementada
        // por PrediccionesActivity


        return v;

    }

}
