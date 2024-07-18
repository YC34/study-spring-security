package com.example.web.controller;


import com.example.web.model.Post;
import com.example.web.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public List<Post> postList(){
       return postService.postList();
    }

    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable Long postId){
        return new Post();
    }



}
