package com.allogica.ForumHUBChallenge.Model.Entities.DTOs;

import com.allogica.ForumHUBChallenge.Model.Entities.Topic;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.format.DateTimeFormatter;

public record DetailedTopicDTO(
        Long id,
        String title,
        String message,
        @JsonProperty("author") String author,
        String status,
        @JsonProperty("created_at") String createdAt,
        AnswerDTO[] answers

) {
    public static DetailedTopicDTO fromTopic(Topic topic){
        return new DetailedTopicDTO(
                topic.getId(),
                topic.getTitle(),
                topic.getMessage(),
                topic.getAuthor().getUsername(),
                topic.getStatus().toString(),
                topic.getCreationDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                topic.getAnswers().stream().map(AnswerDTO::fromAnswer).toArray(AnswerDTO[]::new)
        );

    }

}
