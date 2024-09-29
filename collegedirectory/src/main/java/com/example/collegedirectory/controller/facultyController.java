package com.example.collegedirectory.controller;

import org.apache.catalina.User;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegedirectory.entity.Faculty;
import com.example.collegedirectory.repositories.FacultyRepository;

@RestController
@RequestMapping("/faculty")
public class facultyController 
{
	// FacultyController.java
	

	    @Autowired
	    private FacultyRepository facultyRepository;

	    @GetMapping("/profile")
	    public ResponseEntity<Faculty> getProfile(Authentication authentication) {
	        User user = (User) authentication.getPrincipal();
	        return ResponseEntity.ok(facultyRepository.findById(user.getId()).orElseThrow());
	    }
	}

	


