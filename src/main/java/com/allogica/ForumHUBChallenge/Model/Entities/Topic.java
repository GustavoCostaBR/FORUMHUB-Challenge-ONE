package com.allogica.ForumHUBChallenge.Model.Entities;

import com.allogica.ForumHUBChallenge.Model.Entities.Enums.TopicStatus;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@EqualsAndHashCode(of = "id")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String message;

    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;

    public Topic(String title, String description, User author) {
        this.title = title;
        this.message = description;
        this.author = author;
        this.creationDate = LocalDateTime.now();
        this.status = TopicStatus.NOT_ANSWERED;
        this.answers = new ArrayList<>();
    }

    private TopicStatus status;

    @OneToMany(mappedBy = "topic")
    private List<Answer> answers;

}
