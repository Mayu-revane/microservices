package com.QuizeService.QuizeService.repo;

import com.QuizeService.QuizeService.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
