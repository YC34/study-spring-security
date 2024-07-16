//package com.example.study.controller;
//
//import com.example.study.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.logging.Logger;
//
//@RestController
//@RequestMapping("/jwt")
//public class JwtController {
//    private final Logger logger = Logger.getLogger(this.getClass().getName());
//
//    @Autowired
//    private UserService service;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(){
//        logger.info("jwt token이 발급되었습니다. " + service.login("",""));
//        return ResponseEntity.ok().body(service.login("",""));
//    }
//}
