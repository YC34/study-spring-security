//package com.example.study.controller;
//
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import java.util.logging.Logger;
//
//
//@Controller
//public class HelloController {
//
//    Logger logger = Logger.getLogger(HelloController.class.getName());
//
//    @GetMapping("/")
//    public String hello() {
//        logger.info("'/' URL 요청이 완료되었습니다.");
//        return "Hello SPRING BOOT";
//    }
//
//    @GetMapping("/test")
//    public ResponseEntity<String> test(){
//        String test ="test 중 입니다.";
//        return ResponseEntity.ok().body(test);
//    }
//
//
//
//}
