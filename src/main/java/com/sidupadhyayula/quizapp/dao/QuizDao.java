package com.sidupadhyayula.quizapp.dao;

import com.sidupadhyayula.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
