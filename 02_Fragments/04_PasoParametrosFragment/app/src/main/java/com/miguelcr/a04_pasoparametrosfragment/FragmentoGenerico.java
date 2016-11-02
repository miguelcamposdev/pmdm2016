package com.miguelcr.a04_pasoparametrosfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentoGenerico extends Fragment {
    TextView textViewTitulo;

    public FragmentoGenerico() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_generico, container, false);

        // Rescatamos los argumentos que le hemos pasado al Fragment desde el MainActivity
        Bundle extras = getArguments();

        textViewTitulo = (TextView)v.findViewById(R.id.text_view_titulo_fragment);

        // Modificamos el TextView del layout con el titulo que hemos recibido por argumento.
        textViewTitulo.setText(extras.getString(Constantes.ARG_TITULO_FRAGMENT));

        return v;
    }

}
