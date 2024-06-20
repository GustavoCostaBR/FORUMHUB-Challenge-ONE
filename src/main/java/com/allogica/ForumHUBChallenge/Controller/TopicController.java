package com.allogica.ForumHUBChallenge.Controller;

import com.allogica.ForumHUBChallenge.Model.Entities.Answer;
import com.allogica.ForumHUBChallenge.Model.Entities.DTOs.*;
import com.allogica.ForumHUBChallenge.Model.Entities.Topic;
import com.allogica.ForumHUBChallenge.Model.Entities.User;
import com.allogica.ForumHUBChallenge.Model.Services.Security.TokenService;
import com.allogica.ForumHUBChallenge.Model.Services.TopicService;
import com.allogica.ForumHUBChallenge.Model.Services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RequestMapping("/topic")
@RestController
public class TopicController {

    @Autowired
    TokenService tokenService;

    @Autowired
    public TopicService topicService;

    @Autowired
    public UserService userService;


    @PostMapping("/create")
    public ResponseEntity<DetailedTopicDTO> createTopic(@RequestHeader(HttpHeaders.AUTHORIZATION) String token, @RequestBody @Valid TopicDTO topicDTO, UriComponentsBuilder uriBuilder) {
        if (token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        String userName = tokenService.getUsernameFromToken(token);
        User user = (User) userService.loadUserByUsername(userName);

        Topic topic = topicService.createTopic(topicDTO, user);

        var uri = uriBuilder.path("/topic/{id}").buildAndExpand(topic.getId()).toUri();
        return ResponseEntity.created(uri).body(DetailedTopicDTO.fromTopic(topic));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailedTopicDTO> getTopic(@PathVariable Long id) {
        Topic topic = topicService.getTopic(id);
        return ResponseEntity.ok(DetailedTopicDTO.fromTopic(topic));
    }

    @GetMapping
    public ResponseEntity<ResumedTopicDTO[]> getTopics() {
        return ResponseEntity.ok(topicService.getTopics());
    }

    @PostMapping("/{id}/answer/create")
    public ResponseEntity<ResponseAnswerDTO> createAnswer(@RequestHeader(HttpHeaders.AUTHORIZATION) String token, @PathVariable Long id, @RequestBody @Valid CreateAnswerDTO createAnswerDTO) {
        if (token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        String userName = tokenService.getUsernameFromToken(token);
        User user = (User) userService.loadUserByUsername(userName);

        Answer answer = topicService.addAnswer(id, createAnswerDTO, user);
        ResponseAnswerDTO responseAnswerDTO = ResponseAnswerDTO.fromAnswer(answer);

        return ResponseEntity.ok(responseAnswerDTO);
    }
}
