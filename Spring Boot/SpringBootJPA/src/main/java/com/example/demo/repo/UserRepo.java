package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer> 
{
	
}
