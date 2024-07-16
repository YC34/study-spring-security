package com.example.web.controller;


import com.example.web.model.Post;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping("/")
    public List<Post> postList(){
        return List.of(
                new Post("1","title1","contents1","", LocalDateTime.now()),
                new Post("2","title2","contents2","", LocalDateTime.now()),
                new Post("3","title3","contents3","", LocalDateTime.now())
        );
    }

    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable Long postId){
        return new Post();
    }



}
