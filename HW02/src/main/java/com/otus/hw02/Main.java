package com.otus.hw02;

import com.otus.hw02.domain.Answer;
import com.otus.hw02.domain.Question;
import com.otus.hw02.domain.Student;
import com.otus.hw02.service.ReaderCSVService;
import com.otus.hw02.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

@ComponentScan
@Configuration
@PropertySource("classpath:application.properties")
public class Main {
    public static void main(String[] args) {
        // TODO: создайте здесь класс контекста
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("/spring-context.xml");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);
        ReaderCSVService  readerCSV = context.getBean(ReaderCSVService.class);

        List<Question> questions = readerCSV.getAnswers();

        StudentService studentService = context.getBean(StudentService.class);
        String firstName="", lastName="";
        System.out.println("Enter First Name:");
        try {
            firstName = new BufferedReader(new InputStreamReader(System.in)).readLine();
            System.out.println("Enter Last Name:");
            lastName = new BufferedReader(new InputStreamReader(System.in)).readLine();


        Student student = studentService.getStudent(firstName, lastName);

        for (Question question: questions) {
            System.out.println("Answer the question:");
            System.out.println(question.getText());
            int choice=0;
            int indexAnswer = 1;
            for (Answer answer : question.getAnswers()) {
                System.out.println("  " + indexAnswer + ". " + answer.getText());
                indexAnswer++;
            }
            choice = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            student.addAnswer(question, question.getAnswers().get(choice-1));

        }
            System.out.println("Answers:");
            HashMap<Question, Answer> answerHashMap = student.getAnswers();
            for (Question question :answerHashMap.keySet()) {
                System.out.println(question.getText());
                System.out.println("  " + answerHashMap.get(question).getText());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Получите Person "Ivan"
//        Person ivan = service.getByName("Ivan");
//        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }

    }
