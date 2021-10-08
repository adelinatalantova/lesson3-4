package com.example.lesson3_4;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lesson3_4.data.QuestionModel;
import com.example.lesson3_4.R;
import com.example.lesson3_4.data.QuizClient;

public class GameActivity extends AppCompatActivity {
    Button firstAnswer, secondAnswer, thirdAnswer, fourAnswer;
    TextView currentLevelTv, questionTv;
    QuestionModel questionModel;

    private String question;
    private String answer;
    private String firstVariant;
    private String secondVariant;
    private String thirdVariant;
    private String fourVariant;
    private String currentLevel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initViews();
        setQuestion();
        click();
    }

    private void initViews() {
        currentLevelTv = findViewById(R.id.level_tv);
        questionTv = findViewById(R.id.question_tv);
        firstAnswer = findViewById(R.id.first_answer);
        secondAnswer = findViewById(R.id.second_answer);
        thirdAnswer = findViewById(R.id.third_answer);
        fourAnswer = findViewById(R.id.four_answer);

    }

    private void setQuestion() {
        questionModel = (QuestionModel) getIntent().getSerializableExtra("model");

        if (questionModel != null) {
            currentLevel = questionModel.getCurrentLevel();
            question = questionModel.getQuestion();
            answer = questionModel.getAnswer();
            firstVariant = questionModel.getFirstVariant();
            secondVariant = questionModel.getSecondVariant();
            thirdVariant = questionModel.getThirdVariant();
            fourVariant = questionModel.getFourVariant();
            currentLevelTv.setText(currentLevel);
            questionTv.setText(question);
            firstAnswer.setText(firstVariant);
            secondAnswer.setText(secondVariant);
            thirdAnswer.setText(thirdVariant);
            fourAnswer.setText(fourVariant);
        }
    }

    private void click() {
        firstAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstAnswer.getText() == answer) {
                    Toast.makeText(GameActivity.this, "Верно!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        secondAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (secondAnswer.getText() == answer) {
                    Toast.makeText(GameActivity.this, "Верно!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        thirdAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (thirdAnswer.getText() == answer) {
                    Toast.makeText(GameActivity.this, "Верно!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        fourAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fourAnswer.getText() == answer) {
                    Toast.makeText(GameActivity.this, "Верно!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
