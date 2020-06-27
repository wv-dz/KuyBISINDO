package com.pkh.kuybisindo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton, mQuitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mGrade = findViewById(R.id.grade);
        mFinalScore = findViewById(R.id.outOf);
        mRetryButton = findViewById(R.id.retry);
        mQuitButton = findViewById(R.id.quit);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("Skor kamu " + score + "!");

        if (score >= 300){
            mGrade.setText("Kamu Menguasainya!");
        }else if (score >= 200){
            mGrade.setText("Kamu Sudah Pintar!");
        }else if (score >= 100) {
            mGrade.setText("Terus Berusaha!");
        }else {
            mGrade.setText("Silahkan belajar di Video");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultActivity.this, game.class));
                ResultActivity.this.finish();
            }
        });

        mQuitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultActivity.this, MainActivity.class));
                ResultActivity.this.finish();
            }
        });
    }
}