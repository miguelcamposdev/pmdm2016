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
public class DetalleDiaFragment extends Fragment {
    TextView texto;

    public DetalleDiaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_detalle_dia, container, false);

        texto = (TextView) v.findViewById(R.id.text_view_detalle);

        return v;
    }


    public void actualizaVistaDetalle(String prediccion) {
        texto.setText(prediccion);
    }

}
