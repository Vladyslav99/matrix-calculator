package com.application.matrixcalculator.model;

import java.util.List;

public class Question {
    private int mQuestion;
    private int mCorrectAnswer;

    private int[] mAnswers = new int[4];

    public Question(int question, int correctAnswer, int[] answers) {
        mQuestion = question;
        mCorrectAnswer = correctAnswer;
        mAnswers = answers;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public int getCorrectAnswer() {
        return mCorrectAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        mCorrectAnswer = correctAnswer;
    }

    public int[] getAnswers() {
        return mAnswers;
    }

    public void setAnswers(int[] answers) {
        mAnswers = answers;
    }
}
