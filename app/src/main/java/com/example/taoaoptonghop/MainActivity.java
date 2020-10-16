package com.example.taoaoptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button su, su2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        su = (Button) findViewById(R.id.button2);

        su.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
        su2 = (Button) findViewById(R.id.button);

        su2.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v1) {
                Intent intent2 = new Intent(MainActivity.this, ProgileActivity.class);
                startActivity(intent2);
            }
        });
    }
}