package com.example.study.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class HelloController {

    Logger logger = Logger.getLogger(HelloController.class.getName());

    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        String test ="test 중 입니다.";
        return ResponseEntity.ok().body(test);
    }


    @PostMapping("/private/admin/test")
    public String postAdminEndpoint() {
        logger.info("admin 호출되었습니다.");
        return "This is a private POST endpoint for ADMIN.";
    }

    @PostMapping("/private/user/test")
    public String postUserEndpoint() {
        logger.info("user 호출되었습니다.");


        return "This is a private POST endpoint for USER.";
    }

}
