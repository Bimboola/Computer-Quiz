/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.udacityquizapp;
        import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * The aim of this activity is to keep track of the Yoruba Quiz attempt and then grade the Quiz.
 * It also reset the Quiz for the user to make another attempt.
 */
public class MainActivity extends AppCompatActivity {

    int quizScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button submitQuiz = ((Button) findViewById(R.id.quiz_submit));

        submitQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(MainActivity.this, "Your Quiz Score is: " + quizScore + " /10" , Toast.LENGTH_SHORT).show();
                ((TextView)findViewById(R.id.report_text)).setText("Quiz Completed! Your Quiz Score is: " + quizScore + "/10");

                quizScore = 0;
                // resetCorrectOption();

            }
        });

        Button resetButtonQuiz = ((Button) findViewById(R.id.quiz_reset));

        resetButtonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Clear all the Radio buttons by clearing the Radio Groups. This ensure that the Quiz options are reset
        so the user can retake the Quiz*/

                resetQuiz();
                quizScore = 0;
                // resetCorrectOption();
            }
        });


        RadioGroup radioGroupOne =   (RadioGroup) findViewById(R.id.rg_question1);
        radioGroupOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.question_one_option1) {
                    quizScore += 1;
                }
            }
        });

        RadioGroup radioGroupTwo =   (RadioGroup) findViewById(R.id.rg_question2);
        radioGroupTwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.question_two_option1) {
                    quizScore += 1;
                }
            }
        });

        RadioGroup radioGroupThree =   (RadioGroup) findViewById(R.id.rg_question3);
        radioGroupThree.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.question_three_option1) {
                    quizScore += 1;
                }
            }
        });


        RadioGroup radioGroupFour =   (RadioGroup) findViewById(R.id.rg_question4);
        radioGroupFour.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.question_four_option1) {
                    quizScore += 1;
                }
            }
        });

        RadioGroup radioGroupFive =   (RadioGroup) findViewById(R.id.rg_question5);
        radioGroupFive.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.question_five_option1) {
                    quizScore += 1;
                }
            }
        });

        RadioGroup radioGroupSix =   (RadioGroup) findViewById(R.id.rg_question6);
        radioGroupSix.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.question_six_option1) {
                    quizScore += 1;
                }
            }
        });

        RadioGroup radioGroupSeven =   (RadioGroup) findViewById(R.id.rg_question7);
        radioGroupSeven.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.question_seven_option1) {
                    quizScore += 1;
                }
            }
        });

        RadioGroup radioGroupEight =   (RadioGroup) findViewById(R.id.rg_question8);
        radioGroupEight.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.question_eight_option1) {
                    quizScore += 1;
                }
            }
        });

        RadioGroup radioGroupNine =   (RadioGroup) findViewById(R.id.rg_question9);
        radioGroupNine.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.question_nine_option1) {
                    quizScore += 1;
                }
            }
        });

        RadioGroup radioGroupTen =   (RadioGroup) findViewById(R.id.rg_question10);
        radioGroupTen.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.question_ten_option1) {
                    quizScore += 1;
                }
            }
        });
    }

    public void resetQuiz(){

        /*Clear all the Radio buttons by clearing the Radio Groups. This ensure that the Quiz options are reset
        so the user can retake the Quiz*/

        ((RadioGroup) findViewById(R.id.rg_question1)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question2)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question3)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question4)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question5)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question6)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question7)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question8)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question9)).clearCheck();
        ((RadioGroup) findViewById(R.id.rg_question10)).clearCheck();
        ((TextView)findViewById(R.id.report_text)).setText("");
        quizScore = 0;
    }



}

