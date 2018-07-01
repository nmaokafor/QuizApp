package com.example.nmaokafor.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // For Number 1
    RadioButton number1_option3;
    // For Number 2
    EditText number2_answer;
    // For Number 3
    RadioButton number3_option2;
    // For Number 4
    EditText number4_answer;
    // For Number 5
    RadioButton number5_option1;
    // For Number 6
    EditText number6_answer;
    // For Number 7
    CheckBox number7_option1;
    CheckBox number7_option2;
    CheckBox number7_option3;
    CheckBox number7_option4;
    // For Number 8
    CheckBox number8_option1;
    CheckBox number8_option2;
    CheckBox number8_option3;
    CheckBox number8_option4;
    // For Number 9
    RadioButton number9_option1;
    // For Number 10
    CheckBox number10_option1;
    CheckBox number10_option2;
    CheckBox number10_option3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.number3_option2));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;


        //
        // number 1 - Correct Answer is #3 (Pull the fire alarm button)
        //
        Boolean answer1;


        number1_option3 = (RadioButton) this.findViewById(R.id.number1_option3);
        answer1 = number1_option3.isChecked();
        if (answer1) {
            answer1_score = 10;
        } else {
            answer1_score = 0;
        }

        //
        // number 2 - Correct Answer is "Life jacket"
        //
        String answer2;
        number2_answer = (EditText) this.findViewById(R.id.number2_answer);
        answer2 = number2_answer.getText().toString().toLowerCase();
        if (answer2.equals("life jacket")) {
            answer2_score = 10;
        } else {
            answer2_score = 0;
        }

        //
        // number 3  - Correct Answer is #2 (No)
        //
        Boolean answer3;
        number3_option2 = (RadioButton) this.findViewById(R.id.number3_option2);
        answer3 = number3_option2.isChecked();
        if (answer3) {
            answer3_score = 10;
        } else {
            answer3_score = 0;
        }

        //
        // number 4 - Correct Answer is "911 or 112"
        //
        String answer4;
        number4_answer = (EditText) this.findViewById(R.id.number4_answer);
        answer4 = number4_answer.getText().toString().toLowerCase();
        if (answer4.equals("911") || answer4.equals("112")) {
            answer4_score = 10;
        } else {
            answer4_score = 0;
        }

        // number 5  - Correct Answer is #1 "First aid kit"
        //
        Boolean answer5;
        number5_option1 = (RadioButton) this.findViewById(R.id.number5_option1);
        answer5 = number5_option1.isChecked();
        if (answer5) {
            answer5_score = 10;
        } else {
            answer5_score = 0;
        }

        //
        // number 6 - Correct Answer is "Expiry date"
        //
        String answer6;
        number6_answer = (EditText) this.findViewById(R.id.number6_answer);
        answer6 = number6_answer.getText().toString().toLowerCase();
        if (answer6.equals("expiry date")) {
            answer6_score = 10;
        } else {
            answer6_score = 0;
        }

        //
        // number 7  - Correct Answers are #1 (Unconsciousness) and #4 (No pulse)
        //
        Boolean answer7_option1;
        Boolean answer7_option2;
        Boolean answer7_option3;
        Boolean answer7_option4;
        number7_option1 = (CheckBox) this.findViewById(R.id.number7_option1);
        number7_option2 = (CheckBox) this.findViewById(R.id.number7_option2);
        number7_option3 = (CheckBox) this.findViewById(R.id.number7_option3);
        number7_option4 = (CheckBox) this.findViewById(R.id.number7_option4);
        answer7_option1 = number7_option1.isChecked();
        answer7_option2 = number7_option2.isChecked();
        answer7_option3 = number7_option3.isChecked();
        answer7_option4 = number7_option4.isChecked();
        if (answer7_option1 && !answer7_option2 && !answer7_option3 && answer7_option4) {
            answer7_score = 10;
        } else {
            answer7_score = 0;
        }

        //
        // number 8 - Correct Answers are #2 (Toys) and #4 (Food)
        //
        Boolean answer8_option1;
        Boolean answer8_option2;
        Boolean answer8_option3;
        Boolean answer8_option4;
        number8_option1 = (CheckBox) this.findViewById(R.id.number8_option1);
        number8_option2 = (CheckBox) this.findViewById(R.id.number8_option2);
        number8_option3 = (CheckBox) this.findViewById(R.id.number8_option3);
        number8_option4 = (CheckBox) this.findViewById(R.id.number8_option4);
        answer8_option1 = number8_option1.isChecked();
        answer8_option2 = number8_option2.isChecked();
        answer8_option3 = number8_option3.isChecked();
        answer8_option4 = number8_option4.isChecked();
        if (!answer8_option1 && answer8_option2 && !answer8_option3 && answer8_option4) {
            answer8_score = 10;
        } else {
            answer8_score = 0;
        }

        //
        // number 9  - Correct Answers is #2 (Soak the wound in cool water for five minutes or longer)
        //
        Boolean answer9;
        number9_option1 = (RadioButton) this.findViewById(R.id.number9_option1);
        answer9 = number9_option1.isChecked();
        if (answer9) {
            answer9_score = 10;
        } else {
            answer9_score = 0;
        }

        //
        // number 10 - Correct Answers are #2 (Try to help the victims) and #3 (Call any local emergency number)
        //
        Boolean answer10_option1;
        Boolean answer10_option2;
        Boolean answer10_option3;
        number10_option1 = (CheckBox) this.findViewById(R.id.number10_option1);
        number10_option2 = (CheckBox) this.findViewById(R.id.number10_option2);
        number10_option3 = (CheckBox) this.findViewById(R.id.number10_option3);
        answer10_option1 = number10_option1.isChecked();
        answer10_option2 = number10_option2.isChecked();
        answer10_option3 = number10_option3.isChecked();
        if (!answer10_option1 && answer10_option2 && answer10_option3) {
            answer10_score = 10;
        } else {
            answer10_score = 0;
        }

        //
        // Final Score
        //
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;


        if (final_score == 100) {
            resultsDisplay = "Excellent! You are an Emergency expert, your score is " + final_score + "%";
        } else if (final_score >= 40) {
            resultsDisplay = "Good Work! However your Emergency skills still need some improvement, your score is " + final_score + "%";
        } else {
            resultsDisplay = "Poor!. You need to work on your Emergency skills. You scored " + final_score + "%, out of 100%";
        }


        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}

