package com.example.topquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity
{
    private TextView mQuestionLabel;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mQuestionLabel = (TextView) findViewById(R.id.activity_game_question_text);
        mButton1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        mButton2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mButton3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mButton4 = (Button) findViewById(R.id.activity_game_answer4_btn);
    }
}