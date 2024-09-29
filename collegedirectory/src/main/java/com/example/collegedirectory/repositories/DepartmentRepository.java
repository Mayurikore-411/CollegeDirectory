package com.example.collegedirectory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegedirectory.entity.Department;

public interface DepartmentRepository  extends JpaRepository<Department, Long> {

}
