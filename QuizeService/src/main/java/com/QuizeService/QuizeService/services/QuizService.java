package com.QuizeService.QuizeService.services;

import com.QuizeService.QuizeService.entity.Quiz;

import java.util.List;

public interface QuizService {


    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);
}
