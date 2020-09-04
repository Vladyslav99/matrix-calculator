package com.application.matrixcalculator.controller.testyourself;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.application.matrixcalculator.R;
import com.application.matrixcalculator.model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TestYourselfActivity extends AppCompatActivity {

    private RadioGroup mRadioGroup;
    private RadioButton mFirstAnswerRadioButton;
    private RadioButton mSecondAnswerRadioButton;
    private RadioButton mThirdAnswerRadioButton;
    private RadioButton mFourthAnswerRadioButton;

    private Button mNextQuestionButton;

    private TextView mQuestionTextView;

    private int mCorrectAnswer = 0;
    private int mIndex = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_yourself);

        mIndex = 0;

        final List<Question> questions = new ArrayList<>();
        questions.add(new Question(R.string.first_question,
                4,
                new int[]{R.string.answer11, R.string.answer12, R.string.answer13, R.string.answer14}
                )
        );
        questions.add(new Question(R.string.second_question,
                        2,
                        new int[]{R.string.answer21, R.string.answer22, R.string.answer23, R.string.answer24}
                )
        );
        questions.add(new Question(R.string.third_question,
                        1,
                        new int[]{R.string.answer31, R.string.answer32, R.string.answer33, R.string.answer34}
                )
        );
        questions.add(new Question(R.string.fourth_question,
                        2,
                        new int[]{R.string.answer41, R.string.answer42, R.string.answer43, R.string.answer44}
                )
        );
        questions.add(new Question(R.string.fifth_question,
                        4,
                        new int[]{R.string.answer51, R.string.answer52, R.string.answer53, R.string.answer54}
                )
        );
        questions.add(new Question(R.string.sixth_question,
                        3,
                        new int[]{R.string.answer61, R.string.answer62, R.string.answer63, R.string.answer64}
                )
        );
        questions.add(new Question(R.string.seventh_question,
                        2,
                        new int[]{R.string.answer71, R.string.answer72, R.string.answer73, R.string.answer74}
                )
        );
        questions.add(new Question(R.string.eighth_question,
                        2,
                        new int[]{R.string.answer81, R.string.answer82, R.string.answer83, R.string.answer84}
                )
        );

        mRadioGroup = findViewById(R.id.answer_rg);

        mFirstAnswerRadioButton = findViewById(R.id.first_answer_rb);
        mFirstAnswerRadioButton.setText(questions.get(mIndex).getAnswers()[0]);

        mSecondAnswerRadioButton = findViewById(R.id.second_answer_rb);
        mSecondAnswerRadioButton.setText(questions.get(mIndex).getAnswers()[1]);

        mThirdAnswerRadioButton = findViewById(R.id.third_answer_rb);
        mThirdAnswerRadioButton.setText(questions.get(mIndex).getAnswers()[2]);

        mFourthAnswerRadioButton = findViewById(R.id.fourth_answer_rb);
        mFourthAnswerRadioButton.setText(questions.get(mIndex).getAnswers()[3]);


        mQuestionTextView = findViewById(R.id.question_tv);
        mQuestionTextView.setText(getString(questions.get(3).getQuestion()));

        mNextQuestionButton = findViewById(R.id.next_question_btn);
        mNextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mIndex != questions.size()-1){
                    if (mFirstAnswerRadioButton.isChecked() || mSecondAnswerRadioButton.isChecked()
                            || mThirdAnswerRadioButton.isChecked() || mFourthAnswerRadioButton.isChecked()){

                        if (mFirstAnswerRadioButton.isChecked()){
                            mCorrectAnswer += (questions.get(mIndex).getCorrectAnswer() == 1) ? 1 : 0;
                        }
                        else if (mSecondAnswerRadioButton.isChecked()){
                            mCorrectAnswer += (questions.get(mIndex).getCorrectAnswer() == 2) ? 1 : 0;
                        }
                        else if (mThirdAnswerRadioButton.isChecked()){
                            mCorrectAnswer += (questions.get(mIndex).getCorrectAnswer() == 3) ? 1 : 0;
                        }
                        else {
                            mCorrectAnswer += (questions.get(mIndex).getCorrectAnswer() == 4) ? 1 : 0;
                        }

                        mIndex++;
                        mQuestionTextView.setText(getString(questions.get(mIndex).getQuestion()));
                        mFirstAnswerRadioButton.setChecked(false);
                        mSecondAnswerRadioButton.setChecked(false);
                        mThirdAnswerRadioButton.setChecked(false);
                        mFourthAnswerRadioButton.setChecked(false);
                        mFirstAnswerRadioButton.setText(questions.get(mIndex).getAnswers()[0]);
                        mSecondAnswerRadioButton.setText(questions.get(mIndex).getAnswers()[1]);
                        mThirdAnswerRadioButton.setText(questions.get(mIndex).getAnswers()[2]);
                        mFourthAnswerRadioButton.setText(questions.get(mIndex).getAnswers()[3]);

                    }
                    else {
                        Toast.makeText(getBaseContext(), "Select answer before!", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    mNextQuestionButton.setEnabled(false);
                    Toast.makeText(getBaseContext(), "Correct answers " + mCorrectAnswer + " of " + questions.size(), Toast.LENGTH_LONG).show();
                }



            }
        });
    }
}
