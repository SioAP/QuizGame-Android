package com.example.quizgame_android.controller;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizgame_android.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @SuppressLint("MissingInflatedId")
    public void clickSolo(View view) throws Exception {
        Controller leController = new Controller();

        EditText aText = (EditText)findViewById(R.id.txtName);
        String aName = aText.getText().toString();

        leController.getMyGame().setPlayerName(aName);
        setContentView(R.layout.activity_question);

        TextView aTxtV = (TextView)findViewById(R.id.total_question);
    }
}