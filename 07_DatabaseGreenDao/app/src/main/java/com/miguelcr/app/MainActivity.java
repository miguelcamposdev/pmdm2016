package com.miguelcr.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.miguelcr.app.localdb.Airline;
import com.miguelcr.app.localdb.OnAirlineListListener;

public class MainActivity extends AppCompatActivity implements OnAirlineListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new AirlineFragment()).commit();
    }

    @Override
    public void onAirlineClickListener(Airline airline) {

    }
}
