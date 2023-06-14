package com.mastercoding.androidappfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class ScoreNumberActivity extends AppCompatActivity {

    TextView welcomeTxt, scoreNumberTxt;
    Button share_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_number);

        welcomeTxt = findViewById(R.id.textView2);
        scoreNumberTxt = findViewById(R.id.score_number_txt);
        share_btn = findViewById(R.id.share_number_btn);

        // Username
        Intent j = getIntent();
        String userName = j.getStringExtra("name");

        // Score Number Display
        String score = getIntent().getStringExtra("score");
        TextView scoreNumberTxt = new TextView(this);
        scoreNumberTxt.setText(score);
        setContentView(scoreNumberTxt);

        share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(userName, Integer.parseInt(score));
            }
        });

    }

    public void shareData(String username, int score){

        // Implicit Intents
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");

        // convert the int to string
        String number = String.valueOf(score);

        i.putExtra(Intent.EXTRA_SUBJECT, username + " got score today!");
        i.putExtra(Intent.EXTRA_TEXT,  "His score is: " + number);

        startActivity(Intent.createChooser(i,"Choose a platform"));

    }

}