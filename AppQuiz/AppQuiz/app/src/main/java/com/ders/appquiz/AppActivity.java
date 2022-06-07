package com.ders.appquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AppActivity extends AppCompatActivity {

    TextView minputEmaill, minputPasswordL;
    Button mbtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        minputEmaill = findViewById(R.id.inputEmailL);
        minputPasswordL = findViewById(R.id.inputPasswordL);
        mbtnLogin = findViewById(R.id.btnLogin);

        mbtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(minputEmaill.getText().toString().equals("gamze@gmail.com") && minputPasswordL.getText().toString().equals("silan")){
                    Intent intent = new Intent(AppActivity.this,CrudActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(AppActivity.this,"Bilgileriniz dogru degil",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    public void giris(View view) {
        Intent intent = new Intent(AppActivity.this,QuizActivity.class);
        startActivity(intent);
    }
}