package com.example.collegedirectory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User 
{
	// User.java

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(unique = true, nullable = false)
	    private String username;
	    
	    @Column(nullable = false)
	    private String password;

//	    @Enumerated(EnumType.STRING)
//	    private Role role;
	    
	    private String name;
	    private String email;
	    private String phone;

	    // Getters and setters
	}

//	public enum Role {
//	    STUDENT, FACULTY_MEMBER, ADMINISTRATOR
//	}

	


