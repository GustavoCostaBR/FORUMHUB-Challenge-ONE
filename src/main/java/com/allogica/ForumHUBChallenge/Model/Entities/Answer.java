package com.allogica.ForumHUBChallenge.Model.Entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@EqualsAndHashCode(of = "id")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    private User author;

    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    public Answer(String message, User author, Topic topic) {
        this.message = message;
        this.author = author;
        this.topic = topic;
        this.creationDate = LocalDateTime.now();
    }


}
