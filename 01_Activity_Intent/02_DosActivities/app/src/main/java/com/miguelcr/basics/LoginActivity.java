package com.miguelcr.basics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void onClickLogin(View view) {
        Log.i("EVENTO","Click en botón login >>> onClickLogin");

        Intent i = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(i);


    }
}
