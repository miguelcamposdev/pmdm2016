package com.miguelcr.a01_duckhunt;

import android.content.DialogInterface;
import android.media.Image;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    ImageView duck;
    TextView counter, nick, countdown;
    int counterDucks = 0;
    Random random;
    boolean gameOver = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        duck = (ImageView) findViewById(R.id.image_view_duck);
        counter = (TextView) findViewById(R.id.text_view_counter);
        nick = (TextView) findViewById(R.id.text_view_nick);
        countdown = (TextView) findViewById(R.id.text_view_countdown);

        nick.setText(getIntent().getExtras().getString("nick"));

        random = new Random();

        // 60 segundos = 60000 ms
        startCountDown();


    }

    private void startCountDown() {
        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
                countdown.setText(millisUntilFinished / 1000+"s");
            }

            public void onFinish() {
                countdown.setText("Game over!");
                mostrarDialogoGameOver();
            }
        }.start();
    }

    private void mostrarDialogoGameOver() {
        gameOver = true;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("GAME OVER!");
        builder.setMessage("¿Qué deseas hacer ahora?");
        // Add the buttons
        builder.setPositiveButton("Reiniciar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
                counterDucks = 0;
                counter.setText("0 ducks");
                startCountDown();
                gameOver = false;

            }
        });
        builder.setNegativeButton("Salir", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
                finish();
            }
        });
        builder.setCancelable(false);
        // Set other dialog properties

        // Create the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void duckClicked(View view) {
        if(!gameOver) {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            int heightScreen = displaymetrics.heightPixels;
            int widthScreen = displaymetrics.widthPixels;

            int heightDuck = duck.getHeight();
            int widthDuck = duck.getWidth();

            int maxWidth = widthScreen - widthDuck;
            int maxHeight = heightScreen - heightDuck;

            int x = random.nextInt(maxWidth - 0 + 1) + 0;
            int y = random.nextInt(maxHeight - 0 + 1) + 0;

            duck.setX(x);
            duck.setY(y);

            // Incrementamos el contador

            counterDucks++;
            counter.setText(counterDucks + " ducks");
        } else {
            Toast.makeText(this, "Game over!!!", Toast.LENGTH_SHORT).show();
        }
    }
}
