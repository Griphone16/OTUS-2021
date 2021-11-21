package com.otus.hw02.domain;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private List<Answer> answers;
    private String text;

    public Question(String text) {
        this.text = text;
        answers = new ArrayList<>();
    }

    public Question(){
        answers = new ArrayList<>();
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void addAnswers(Answer answer) {
        this.answers.add(answer);
    }

    @Override
    public String toString() {
        return "Question{" +
                "text=" + text +
                ", answers='" + answers + '\'' +
                '}';
    }
}
