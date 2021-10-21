package com.cheerup.intranet.controller;

import com.cheerup.intranet.model.AuthRequest;
import com.cheerup.intranet.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {
    private Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);


//    @Autowired
//    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping(path = "/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok()
                .body("Bienvenue dans Cheer-up Intranet !");
    }

    @PostMapping(path = "/login")
    public String generateToken(@RequestBody AuthRequest request) {
        LOGGER.debug("\n\ngenerateToken() - request : {}\n" , request);

//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword())
//        );

        return jwtUtil.generateToken(request.getUserName());
    }
}
