package com.miguelcr.a01_duckhunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nick = (EditText) findViewById(R.id.edit_text_nick);
    }


    public void startGame(View view) {
        String nickName = nick.getText().toString();

        Intent i = new Intent(this, GameActivity.class);
        i.putExtra("nick",nickName);
        startActivity(i);
    }
}
