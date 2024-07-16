//package com.example.study.service;
//
//import com.example.study.config.JwtUtil;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//    @Value("${jwt.secret}")
//    private String secretKey;
//
//    private Long expirationTime = 1000*60*60l;
//
//    public String login(String userName, String password) {
//        // 인증과정 생략
//
//        return JwtUtil.createJwt(userName,secretKey,expirationTime);
//    }
//}
