package com.example.collegedirectory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Course 
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String description;

	    @ManyToOne
	    @JoinColumn(name = "department_id")
	    private Department department;

	    @ManyToOne
	    @JoinColumn(name = "faculty_id")
	    private Faculty faculty;
	
	
}
