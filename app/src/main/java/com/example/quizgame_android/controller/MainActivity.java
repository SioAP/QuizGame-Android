package com.example.quizgame_android.controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizgame_android.R;
import com.example.quizgame_android.model.*;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSolo = findViewById(R.id.btnSolo);

        btnSolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText aText = findViewById(R.id.txtName);
                String aName = aText.getText().toString();

                if (aName.length() > 0) {
                    User user = new User(aName);

                    Controller controller = null;
                    try {
                        controller = new Controller();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
                    intent.putExtra("user", user);
                    intent.putExtra("controller", controller);
                    startActivity(intent);
                }
            }
        }) ;
    }
}