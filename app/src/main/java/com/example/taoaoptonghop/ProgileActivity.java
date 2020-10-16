package com.example.taoaoptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgileActivity extends AppCompatActivity {
    Button music, logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progile);
        music = (Button) findViewById(R.id.button3);
        logout = (Button) findViewById(R.id.button4);
        music.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProgileActivity.this, LostviewActivity.class);
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent intent2 = new Intent(ProgileActivity.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}