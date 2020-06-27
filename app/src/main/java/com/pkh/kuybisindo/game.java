package com.pkh.kuybisindo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class game extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private ImageView mImage;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    Button quit;
    TextView Final;

    private String mAnswer;
    public int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mScoreView = findViewById(R.id.score);
        mImage = findViewById(R.id.image_quiz);
        mQuestionView = findViewById(R.id.question);
        mButtonChoice1 = findViewById(R.id.choice1);
        mButtonChoice2 = findViewById(R.id.choice2);
        mButtonChoice3 = findViewById(R.id.choice3);

        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 100;
                    updateScore();
                    //This line of code is optiona
                    if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(game.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        game.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(game.this, "Jawaban Kamu Benar!", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    mScore = mScore - 50;
                    updateScore();
                    if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(game.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        game.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(game.this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 100;
                    updateScore();
                    //This line of code is optiona


                    if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(game.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        game.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(game.this, "Jawaban Kamu Benar!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    mScore = mScore - 50;
                    updateScore();

                    if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(game.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        game.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(game.this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 100;
                    updateScore();
                    //This line of code is optiona

                    if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(game.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        game.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(game.this, "Jawaban Kamu Benar!", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    mScore = mScore - 50;
                    updateScore();
                    if (mQuestionNumber == QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(game.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        game.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(game.this, "Jawaban Kamu Salah!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        //End of Button Listener for Button3
    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mImage.setImageResource(QuestionLibrary.mImageView[mQuestionNumber]);
        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    @SuppressLint("SetTextI18n")
    private void updateScore() {
        mScoreView.setText("" + mScore);
    }

    @Override
    public void onBackPressed() {
        askToClose();
    }

    private void askToClose () {
        AlertDialog.Builder builder = new AlertDialog.Builder(game.this);
        builder.setMessage("Ingin keluar?");
        builder.setCancelable(true);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}