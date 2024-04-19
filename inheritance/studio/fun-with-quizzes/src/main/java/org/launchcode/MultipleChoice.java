package org.launchcode;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    public MultipleChoice(String quizQuestion, ArrayList<String> answerChoices) {
        super(quizQuestion, answerChoices);
    }

    @Override
    public void displayQuestions() {
        System.out.println(getQuizQuestion());
    }
}
