package com.example.collegedirectory.controller;

import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegedirectory.repositories.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthController 
{
	// AuthController.java
	
	

	    @Autowired
	    private UserRepository userRepository;

	    @PostMapping("/login")
	    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
	        Optional<User> userOptional = UserRepository.findByUsername(loginRequest.getUsername());
	        if (!userOptional.isPresent()) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	        }

	        User user = userOptional.get();
	        if (!user.getPassword().equals(loginRequest.getPassword())) {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	        }

	        return ResponseEntity.ok(user.getRole().toString());
	    
	}


}
