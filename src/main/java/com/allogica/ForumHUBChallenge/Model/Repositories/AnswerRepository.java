package com.allogica.ForumHUBChallenge.Model.Repositories;

import com.allogica.ForumHUBChallenge.Model.Entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
