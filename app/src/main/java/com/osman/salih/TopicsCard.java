package com.osman.salih;

public class TopicsCard {

    private String questions, answers;
    private boolean expandedle;

    public TopicsCard(String questions, String answers) {
        this.questions = questions;
        this.answers = answers;
        this.expandedle = false;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public boolean isExpandedle() {
        return expandedle;
    }

    public void setExpandedle(boolean expandedle) {
        this.expandedle = expandedle;
    }

    @Override
    public String toString() {
        return "TopicsCard{" +
                "questions='" + questions + '\'' +
                ", answers='" + answers + '\'' +
                '}';
    }
}
