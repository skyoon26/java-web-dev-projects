package org.launchcode;

import java.util.ArrayList;

public abstract class Question {
    private String quizQuestion;
    private ArrayList<String> answerChoices;

    public Question(String quizQuestion, ArrayList<String> answerChoices) {
        this.quizQuestion = quizQuestion;
        this.answerChoices = answerChoices;
    }

    public String getQuizQuestion() {
        return quizQuestion;
    }

    public void setQuizQuestion(String quizQuestion) {
        this.quizQuestion = quizQuestion;
    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(ArrayList<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    @Override
    public String toString() {
        return "Question{" +
                "quizQuestion='" + quizQuestion + '\'' +
                ", answerChoices=" + answerChoices +
                '}';
    }

    public abstract void displayQuestions();

}
