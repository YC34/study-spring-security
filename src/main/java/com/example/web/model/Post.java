package com.example.web.model;


import java.time.LocalDateTime;


public class Post {
    private String postId;
    private String title;
    private String contents;
    private String author;
    private LocalDateTime createdAt;


    // 생성자
    public Post() {
    }

    public Post(String postId, String title, String contents, String author, LocalDateTime createdAt) {
        this.postId = postId;
        this.title = title;
        this.contents = contents;
        this.author = author;
        this.createdAt = createdAt;
    }


    // getter and setter
    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
