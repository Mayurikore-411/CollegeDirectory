package com.example.collegedirectory.repositories;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository  extends JpaRepository<User, Long>{
 
}
