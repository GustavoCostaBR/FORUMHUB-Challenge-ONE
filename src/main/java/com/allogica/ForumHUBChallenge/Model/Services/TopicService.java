package com.allogica.ForumHUBChallenge.Model.Services;

import com.allogica.ForumHUBChallenge.Model.Entities.DTOs.ResumedTopicDTO;
import com.allogica.ForumHUBChallenge.Model.Entities.DTOs.TopicDTO;
import com.allogica.ForumHUBChallenge.Model.Entities.Topic;
import com.allogica.ForumHUBChallenge.Model.Entities.User;
import com.allogica.ForumHUBChallenge.Model.Repositories.TopicRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    @Transactional
    public Topic createTopic(TopicDTO topicDTO, User user) {
        Topic topic = new Topic(topicDTO.title(), topicDTO.description(), user);
        topicRepository.save(topic);
        return topic;
    }

    public Topic getTopic(Long id) {
        return topicRepository.findById(id).orElseThrow();
    }

    public ResumedTopicDTO[] getTopics() {
        return topicRepository.findAll().stream().map(ResumedTopicDTO::fromTopic).toArray(ResumedTopicDTO[]::new);
    }
}
