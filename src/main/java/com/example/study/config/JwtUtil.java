//package com.example.study.config;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//import java.util.Date;
//
//public class JwtUtil {
//
//
//    public static String createJwt(String userName, String secretKey,Long expirationTime){
//        Claims claims = Jwts.claims();
//        claims.put("userName", userName);
//
//        return Jwts.builder()
//                .setClaims(claims)
//                .setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis() +expirationTime))
//                .signWith(SignatureAlgorithm.HS256, secretKey)
//                .compact();
//    }
//
//
//
////
////    public String generateToken(String username) {
////        return Jwts.builder()
////                .setSubject(username)
////                .setIssuedAt(new Date())
////                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
////                .signWith(SignatureAlgorithm.HS512,secretKey)
////                .compact();
////    }
////
////    public Claims extractClaims(String token) {
////        return Jwts.parser()
////                .setSigningKey(secretKey)
////                .parseClaimsJwt(token)
////                .getBody();
////    }
////
////    public boolean isTokenExpired(String token) {
////        return extractClaims(token).getExpiration().before(new Date());
////    }
////
////    public String extractUsername(String username){
////        return extractClaims(username).getSubject();
////    }
//
//}
