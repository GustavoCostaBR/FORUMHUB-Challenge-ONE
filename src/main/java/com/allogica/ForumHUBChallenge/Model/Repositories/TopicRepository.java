package com.allogica.ForumHUBChallenge.Model.Repositories;

import com.allogica.ForumHUBChallenge.Model.Entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
