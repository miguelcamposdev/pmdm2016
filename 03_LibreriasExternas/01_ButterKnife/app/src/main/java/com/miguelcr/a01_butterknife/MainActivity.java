package com.miguelcr.a01_butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    //TextView texto;
    @BindView(R.id.text_view) TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //texto = (TextView) findViewById(R.id.text_view);

        texto.setText("ButterKnife funciona!");
    }
}
