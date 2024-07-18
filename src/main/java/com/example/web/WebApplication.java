package com.example.web;

import com.example.web.model.Post;
import com.example.web.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@RequiredArgsConstructor
public class WebApplication implements CommandLineRunner {

    private final PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Post> postList =  List.of(
                new Post(UUID.randomUUID(),"title1","contents1","", LocalDateTime.now()),
                new Post(UUID.randomUUID(),"title2","contents2","", LocalDateTime.now()),
                new Post(UUID.randomUUID(),"title3","contents3","", LocalDateTime.now())
        );

        postRepository.saveAll(postList);
    }
}
