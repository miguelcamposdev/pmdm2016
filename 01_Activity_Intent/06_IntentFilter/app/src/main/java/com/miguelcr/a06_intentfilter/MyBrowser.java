package com.miguelcr.a06_intentfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MyBrowser extends AppCompatActivity {
    WebView navegador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_browser);

        navegador = (WebView) findViewById(R.id.web_view);
        navegador.loadUrl("http://www.google.es");

    }
}
