package com.miguelcr.a06_intentfilter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void abriWebEnNavegador(View view) {
        TextView textViewUrl = (TextView)view;
        String urlNavegador = textViewUrl.getText().toString();

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(urlNavegador));
        startActivity(i);
    }
}
