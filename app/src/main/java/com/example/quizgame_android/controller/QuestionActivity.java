package com.example.quizgame_android.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizgame_android.R;
import com.example.quizgame_android.model.*;

import java.util.ArrayList;

public class QuestionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        User user = getIntent().getParcelableExtra("user");
        //Controller controller = getIntent().getParcelableExtra("controller");
        Controller controller = null;
        try {
            controller = new Controller();
        } catch (Exception e) {
            e.printStackTrace();
        }

        TextView aText = findViewById(R.id.name_user);
        TextView aNumber = findViewById(R.id.score_user);
        TextView aQuestion = findViewById(R.id.question);

        aText.setText(user.getName());
        String score = String.valueOf(user.getScore());
        aNumber.setText(score);

        //ArrayList<Question> Questions = controller.getMyGame().getQuestions();
        //aQuestion.setText(Questions.get(0).getDescriptionQuestion());
    }
}
