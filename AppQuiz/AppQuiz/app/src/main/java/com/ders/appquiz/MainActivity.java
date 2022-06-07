package com.ders.appquiz;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout fire = findViewById(R.id.fireLayout);

        final Button startButton = findViewById(R.id.startQuiz);
        final Button startCrud = findViewById(R.id.startCrud);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="java";
                java.setBackgroundResource(R.drawable.round_back_white_stroke);
                fire.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="C#";
                fire.setBackgroundResource(R.drawable.round_back_white_stroke);
                java.setBackgroundResource(R.drawable.round_back_white10);
            }
        });


        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"Seçim Yapmadınız. Lütfen seçim yapın.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });

    }

    public void yonetici(View view) {
        Intent intent = new Intent(MainActivity.this,AppActivity.class);
        startActivity(intent);
    }
}