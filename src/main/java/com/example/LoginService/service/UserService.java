package com.example.LoginService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LoginService.entity.User;
import com.example.LoginService.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
	public User getById(int Id) {
		System.out.println("inside  service");
		return userRepo.findById(Id).get();
		
	}

}