package com.mastercoding.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent i = getIntent();
        String k = i.getStringExtra("id");

        Toast.makeText(this,
                "We passed: "+k, Toast.LENGTH_SHORT).show();

    }
}