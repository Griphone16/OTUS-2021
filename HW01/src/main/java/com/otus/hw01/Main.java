package com.otus.hw01;

import com.otus.hw01.domain.Question;
import com.otus.hw01.service.QuestionService;
import com.otus.hw01.service.ReaderCSVService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO: создайте здесь класс контекста
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");
        ReaderCSVService  readerCSV = context.getBean(ReaderCSVService.class);

        List<Question> questions = readerCSV.getAnswers();
        for (Question question: questions) {
            System.out.println(question);
        }
        // Получите Person "Ivan"
//        Person ivan = service.getByName("Ivan");
//        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }

    }
