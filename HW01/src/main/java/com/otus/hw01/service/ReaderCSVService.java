package com.otus.hw01.service;

import com.otus.hw01.domain.Answer;
import com.otus.hw01.domain.Question;

import java.util.List;

public interface ReaderCSVService {

    List<Question> getAnswers();
}
