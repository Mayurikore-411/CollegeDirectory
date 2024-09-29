package com.example.collegedirectory.entity;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity
public class Student 
{
	// StudentProfile.java

	
	    @Id
	    private Long userId;

	    private String photo;
	    private String year;

	    @ManyToOne
	    @JoinColumn(name = "department_id")
	    private Department department;

	    @OneToOne
	    @MapsId
	    @JoinColumn(name = "user_id")
	    private User user;

	    // Getters and setters
	}



