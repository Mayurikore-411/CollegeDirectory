package com.example.collegedirectory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegedirectory.entity.Faculty;

public interface FacultyRepository  extends JpaRepository<Faculty, Long> {

}
