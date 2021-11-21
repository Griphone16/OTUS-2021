package com.otus.hw02.service;

import com.otus.hw02.dao.ReaderCSVDao;
import com.otus.hw02.domain.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderCSVServiceImpl implements ReaderCSVService{
    private final ReaderCSVDao dao;

    public ReaderCSVServiceImpl(ReaderCSVDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Question> getAnswers() {
        return dao.getAnswers();
    }
}
