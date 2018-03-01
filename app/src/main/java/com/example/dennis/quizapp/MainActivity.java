package com.example.dennis.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gradeQuiz(View view) {
        int score = 0;
        int grade = 0;
        String remark = "";


        RadioGroup questionOne = (RadioGroup) findViewById(R.id.rg_qn1);
        int correctQnOneID = findViewById(R.id.soln_1b).getId();

        int selectedQnOneID = questionOne.getCheckedRadioButtonId();
        if (selectedQnOneID == correctQnOneID) {
            score += 1;
        }

        String displayScore = getString(R.string.your_score) + " " + score;
        TextView displayScoreText = (TextView) findViewById(R.id.your_score);
        displayScoreText.setText(displayScore);

    }
}
