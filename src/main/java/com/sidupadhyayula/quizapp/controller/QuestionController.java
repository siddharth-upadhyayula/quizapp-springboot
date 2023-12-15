package com.sidupadhyayula.quizapp.controller;

import com.sidupadhyayula.quizapp.Question;
import com.sidupadhyayula.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions () {
        return (List<Question>) questionService.getAllQuestions();
    }



}
