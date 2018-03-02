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
//        int grade = 0;
//        String remark = "";

//      Question One params
        RadioGroup questionOne = findViewById(R.id.rg_qn1);
        int selectedQnOneID = questionOne.getCheckedRadioButtonId();
        int correctQnOneID = findViewById(R.id.soln_1c).getId();
//      Check qn 1 answer
        if (selectedQnOneID == correctQnOneID) {
            score += 1;
        }

        //  Question Two params
        RadioGroup questionTwo = findViewById(R.id.rg_qn2);
        int selectedQnTwoID = questionTwo.getCheckedRadioButtonId();
        int correctQnTwoID = findViewById(R.id.soln_2a).getId();
//      Check qn 2 answer
        if (selectedQnTwoID == correctQnTwoID) {
            score += 1;
        }

        //  Question Three params
        RadioGroup questionThree = findViewById(R.id.rg_qn3);
        int selectedQnThreeID = questionThree.getCheckedRadioButtonId();
        int correctQnThreeID = findViewById(R.id.soln_3c).getId();
//      Check qn 3 answer
        if (selectedQnThreeID == correctQnThreeID) {
            score += 1;
        }

        //  Question Four params
        RadioGroup questionFour = findViewById(R.id.rg_qn4);
        int selectedQnFourID = questionFour.getCheckedRadioButtonId();
        int correctQnFourID = findViewById(R.id.soln_4c).getId();
//      Check qn 4 answer
        if (selectedQnFourID == correctQnFourID) {
            score += 1;
        }

        //  Question Five params
        RadioGroup questionFive = findViewById(R.id.rg_qn5);
        int selectedQnFiveID = questionFive.getCheckedRadioButtonId();
        int correctQnFiveID = findViewById(R.id.soln_5d).getId();
//      Check qn 5 answer
        if (selectedQnFiveID == correctQnFiveID) {
            score += 1;
        }

        //  Question Six params
        RadioGroup questionSix = findViewById(R.id.rg_qn6);
        int selectedQnSixID = questionSix.getCheckedRadioButtonId();
        int correctQnSixID = findViewById(R.id.soln_6a).getId();
//      Check qn 5 answer
        if (selectedQnSixID == correctQnSixID) {
            score += 1;
        }

        //  Question Seven params
        RadioGroup questionSeven = findViewById(R.id.rg_qn7);
        int selectedQnSevenID = questionSeven.getCheckedRadioButtonId();
        int correctQnSevenID = findViewById(R.id.soln_7b).getId();
//      Check qn 5 answer
        if (selectedQnSevenID == correctQnSevenID) {
            score += 1;
        }

        String displayScore = getString(R.string.your_score) + " " + score + " out of 5.";
        TextView scoreTextView = findViewById(R.id.your_score);
        scoreTextView.setText(displayScore);

    }

}
