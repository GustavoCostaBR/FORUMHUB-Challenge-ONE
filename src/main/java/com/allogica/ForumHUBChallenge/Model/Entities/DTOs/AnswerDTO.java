package com.allogica.ForumHUBChallenge.Model.Entities.DTOs;

import com.allogica.ForumHUBChallenge.Model.Entities.Answer;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.format.DateTimeFormatter;

public record AnswerDTO(
        @NotNull
        Long id,
        @NotBlank
        String message,
        @NotBlank
        String authorName,

        @NotBlank(message = "The creation date is required.")
        @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$",message = "The creation date must be in the format dd/MM/yyyy.")
        String creationDate,
        @NotNull
        Long topicId
) {

    public static AnswerDTO fromAnswer(Answer answer) {
        return new AnswerDTO(
                answer.getId(),
                answer.getMessage(),
                answer.getAuthor().getUsername(),
                answer.getCreationDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                answer.getTopic().getId()
        );
    }
}
