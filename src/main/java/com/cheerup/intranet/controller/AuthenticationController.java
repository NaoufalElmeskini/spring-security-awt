package com.cheerup.intranet.controller;

import com.cheerup.intranet.model.AuthRequest;
import com.cheerup.intranet.model.dto.UserDTO;
import com.cheerup.intranet.util.JwtUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
public class AuthenticationController {
    private Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDetailsService userDetailsService;


    @PostMapping(path = "/login")
    public String generateToken(@RequestBody AuthRequest request) {
        LOGGER.debug("\n\ngenerateToken() - request : {}\n" , request);

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword())
        );

        return jwtUtil.generateToken(request.getUserName());
    }

    @GetMapping(path = "/user")
    @Operation(summary = "User details endpoint", security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<UserDetails> getUserDetails(Principal principal) {

        String userName = principal.getName();

        UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
        //todo: map userDetail to userDTO

        return ResponseEntity.ok()
                .body(userDetails);
    }

    @GetMapping("/staticUsers")
    public ResponseEntity getUserList() {
        return ResponseEntity.ok().body(userDetailsService.);
    }
}
