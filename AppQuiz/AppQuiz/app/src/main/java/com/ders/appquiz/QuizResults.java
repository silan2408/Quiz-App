package com.ders.appquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startBtn = findViewById(R.id.startQuiz);
        final TextView correctAnswer = findViewById(R.id.dogru);
        final TextView incorrectAnswer = findViewById(R.id.yanlis);

        final int getCorrectAnswer = getIntent().getIntExtra("correct",0);
        final int getInCorrectAnswer = getIntent().getIntExtra("incorrect",0);

        correctAnswer.setText("Dogru sayısı: "+ getCorrectAnswer);
        incorrectAnswer.setText(String.valueOf(getInCorrectAnswer));

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizResults.this,MainActivity.class));
                finish();
            }
        });

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults.this,MainActivity.class));
        finish();
    }
}