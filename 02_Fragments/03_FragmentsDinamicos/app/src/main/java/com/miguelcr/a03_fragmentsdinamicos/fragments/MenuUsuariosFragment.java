package com.miguelcr.a03_fragmentsdinamicos.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miguelcr.a03_fragmentsdinamicos.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuUsuariosFragment extends Fragment {


    public MenuUsuariosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_usuarios, container, false);
    }

}
