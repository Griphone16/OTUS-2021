package com.otus.hw02.domain;

import java.security.PrivateKey;
import java.util.HashMap;

public class Student {
    private String firstName, lastName;

    private HashMap<Question, Answer> answers;

    public Student() {
        answers = new HashMap<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addAnswer(Question question, Answer answer) {
        answers.put(question, answer);
    }

    public HashMap<Question, Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(HashMap<Question, Answer> answers) {
        this.answers = answers;
    }
}
