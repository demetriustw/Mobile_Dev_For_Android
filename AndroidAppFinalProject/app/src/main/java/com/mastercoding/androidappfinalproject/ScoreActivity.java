package com.mastercoding.androidappfinalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreActivity extends AppCompatActivity {
    TextView questionTxt;
    Button right_btn, wrong_btn;
    int score_num = 0;

    protected void OnCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.right_wrong);

        questionTxt = findViewById(R.id.textView);
        right_btn = findViewById(R.id.btn);
        wrong_btn = findViewById(R.id.btn2);

        // Username
        Intent i = getIntent();
        String userName = i.getStringExtra("name");

        // Score Number Display
        String score = getIntent().getStringExtra("score");

        TextView scoreNumberTxt = new TextView(this);
        scoreNumberTxt.setText(score);
        setContentView(scoreNumberTxt);

        if (right_btn.callOnClick()) {

            score_num = score_num++;

            // Explicit Intent
            Intent j = new Intent(getApplicationContext(),
                    ScoreNumberActivity.class);

            // Passing the name to second activity
            j.putExtra("name", userName);

            startActivity(j);

            Intent intent = new Intent(this, ScoreActivity.class);
            intent.putExtra("score", score);
            startActivity(intent);

        } else {

            Intent j = new Intent(getApplicationContext(),
                    ScoreNumberActivity.class);

            j.putExtra("name", userName);

            startActivity(j);

            Intent intent = new Intent(this, ScoreActivity.class);
            intent.putExtra("score", score);
            startActivity(intent);

        }

    }
}
