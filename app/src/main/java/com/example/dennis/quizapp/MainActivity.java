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

    /**
     * Method (it and the one below it) compare selected responses to
     * correct ones and update score as applies
     * Also update Grade and Remark
     *
     * @param view
     */
    public void gradeQuiz(View view) {

//      Question One params
        RadioGroup questionOne = (RadioGroup) findViewById(R.id.rg_qn1);
        int selectedQnOneID = questionOne.getCheckedRadioButtonId();
        int correctQnOneID = findViewById(R.id.soln_1b).getId();

//      Call method that validates answers with qn one params
        checkAnswers(selectedQnOneID, correctQnOneID);


    }

    public void checkAnswers(int correctID, int selectedID) {
        int score = 0;
        int grade = 0;
        String remark = "";

        if (selectedID == correctID) {
            score += 1;
        }

        String displayScore = getString(R.string.your_score) + " " + score + " out of 15.";
        TextView scoreTextView = (TextView) findViewById(R.id.your_score);
        scoreTextView.setText(displayScore);

    }
}
