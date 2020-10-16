package com.example.taoaoptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LostviewActivity extends AppCompatActivity {
    ListView list;
    ArrayList<String> nhac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lostview);
        list = (ListView) findViewById(R.id.listView);
        nhac = new ArrayList<>();
        nhac.add("Dethsupport");
        nhac.add("through the fire and flames");
        nhac.add("Skyhunter");
        nhac.add("Impeach God");
        nhac.add("Beach house");
        nhac.add("Go forth and die");
        nhac.add("My name is murder");
        nhac.add("Thunderstruck");
        nhac.add("Master of the pupet");
        nhac.add("The way of Viking");
        nhac.add("Burn the eath");;
        nhac.add("Murmaider");
        nhac.add("Andromeda");
        nhac.add("Bloodline");
        nhac.add("The gear");
        nhac.add("Blazing star");

        ArrayAdapter adapter = new ArrayAdapter(LostviewActivity.this, android.R.layout.simple_list_item_1, nhac);

        list.setAdapter(adapter);
    }
}