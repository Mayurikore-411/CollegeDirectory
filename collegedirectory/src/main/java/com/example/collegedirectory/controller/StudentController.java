package com.example.collegedirectory.controller;

import org.apache.catalina.User;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegedirectory.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	
	 @Autowired
	    private StudentRepository studentRepository;

	    @GetMapping("/profile")
	    public ResponseEntity<Student> getProfile(Authentication authentication) {
	        User user = (User) authentication.getPrincipal();
	        return ResponseEntity.ok(studentRepository.findById(user.getId()).orElseThrow());

}
}
