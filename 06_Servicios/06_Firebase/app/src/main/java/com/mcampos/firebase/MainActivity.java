package com.mcampos.firebase;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    EditText editTextEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
    }

    public void registroDispositivo(View view) {
        // Petición de Retrofit para registrar el dispositivo

        // http://server/RegisterDevice.php
        // name = ...
        // email = ...
        // token = ...

        SharedPreferences sharedPref = getSharedPreferences("PREFS_FIREBASE",Context.MODE_PRIVATE);
        String token = sharedPref.getString("token","");

        if(token.isEmpty()) {
            Toast.makeText(this, "Aún no se ha generado ", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Token: "+token, Toast.LENGTH_SHORT).show();

            if(!editTextEmail.getText().toString().equals("") && !token.equals("0")) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("http://miguelftp.esy.es/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                HostingerApiInterface apiService =
                        retrofit.create(HostingerApiInterface.class);

                Call<ResponseRegister> call = apiService.registerDevice(editTextEmail.getText().toString(), token);

                call.enqueue(new Callback<ResponseRegister>() {

                    @Override
                    public void onResponse(Call<ResponseRegister> call, Response<ResponseRegister> response) {

                        int statusCode = response.code();

                        Log.i("ErroConexion", "Status Code = " + statusCode + " http ok =" + HttpURLConnection.HTTP_OK);

                        if (statusCode == HttpURLConnection.HTTP_OK && response.body() != null) {
                            ResponseRegister user = response.body();
                            Toast.makeText(MainActivity.this, user.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseRegister> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    }

                });
            } else {
                Toast.makeText(this, "No hay token o email", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
