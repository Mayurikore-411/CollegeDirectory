package com.example.collegedirectory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegedirectory.entity.Student;

public interface StudentRepositorys extends JpaRepository<Student, Long>
{

}
