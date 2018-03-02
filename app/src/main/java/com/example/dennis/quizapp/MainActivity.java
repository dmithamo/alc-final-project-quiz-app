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
     */
    public void gradeQuiz(View view) {

        int score = 0;
        int grade = 0;
        String remark = "";

//      Question One params
        RadioGroup questionOne = (RadioGroup) findViewById(R.id.rg_qn1);
        int selectedQnOneID = questionOne.getCheckedRadioButtonId();
        int correctQnOneID = findViewById(R.id.soln_1c).getId();
//      Check qn 1 answer
        if (selectedQnOneID == correctQnOneID) {
            score += 1;
        }

        //  Question Two params
        RadioGroup questionTwo = (RadioGroup) findViewById(R.id.rg_qn2);
        int selectedQnTwoID = questionTwo.getCheckedRadioButtonId();
        int correctQnTwoID = findViewById(R.id.soln_2a).getId();
//      Check qn 2 answer
        if (selectedQnTwoID == correctQnTwoID) {
            score += 1;
        }

        //  Question Three params
        RadioGroup questionThree = (RadioGroup) findViewById(R.id.rg_qn3);
        int selectedQnThreeID = questionThree.getCheckedRadioButtonId();
        int correctQnThreeID = findViewById(R.id.soln_3c).getId();
//      Check qn 3 answer
        if (selectedQnThreeID == correctQnThreeID) {
            score += 1;
        }

        //  Question Four params
        RadioGroup questionFour = (RadioGroup) findViewById(R.id.rg_qn4);
        int selectedQnFourID = questionFour.getCheckedRadioButtonId();
        int correctQnFourID = findViewById(R.id.soln_4c).getId();
//      Check qn 3 answer
        if (selectedQnFourID == correctQnFourID) {
            score += 1;
        }

        String displayScore = getString(R.string.your_score) + " " + score + " out of 15.";
        TextView scoreTextView = findViewById(R.id.your_score);
        scoreTextView.setText(displayScore);

    }

}
