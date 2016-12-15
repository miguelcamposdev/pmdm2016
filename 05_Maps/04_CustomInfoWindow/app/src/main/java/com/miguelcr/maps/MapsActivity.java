package com.miguelcr.maps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private List<Jugador> jugadores;
    private Map<Marker,Jugador> mapMarkers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Ronaldo",25,new LatLng(39.399872,-8.224454),"http://i.forbesimg.com/media/lists/people/cristiano-ronaldo_416x416.jpg"));
        jugadores.add(new Jugador("Gareth Bale",15,new LatLng(51.481581,-3.17909),"http://www.ligadeportivahn.com/images/GARETH-BALE.jpg"));

        mapMarkers = new HashMap<>();
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        for (Jugador j: jugadores) {
            Marker marker = mMap.addMarker(
                    new MarkerOptions()
                            .position(j.getPosicion())
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon_marker)));

            mapMarkers.put(marker,j);
        }



        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                View v = getLayoutInflater().inflate(R.layout.info_window_layout, null);

                Jugador currentJugador = mapMarkers.get(marker);

                // Getting reference to the TextView to set latitude
                ImageView imageViewFoto = (ImageView) v.findViewById(R.id.info_window_foto);
                TextView textViewNombre = (TextView) v.findViewById(R.id.info_window_nombre);
                TextView textViewGoles = (TextView) v.findViewById(R.id.info_window_goles);

                textViewNombre.setText(currentJugador.getNombre());
                textViewGoles.setText(String.valueOf(currentJugador.getGoles()));
                Picasso.with(MapsActivity.this)
                        .load(currentJugador.getFoto())
                        .resize(100,150)
                        .centerCrop()
                        .into(imageViewFoto);

                // Returning the view containing InfoWindow contents
                return v;
            }
        });
    }


}
