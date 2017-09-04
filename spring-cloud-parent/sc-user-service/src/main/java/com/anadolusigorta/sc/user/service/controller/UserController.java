package com.anadolusigorta.sc.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anadolusigorta.sc.user.service.model.User;
import com.anadolusigorta.sc.user.service.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	UserRepository userRepo;
	
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user){
		
		User savedUser = userRepo.save(user);
		
		return savedUser;
	}
	
	@GetMapping("{name}")
	public User getUserByName(@PathVariable("name")String name){
		
		User findedUserByName = userRepo.findUserByName(name);
		
		return findedUserByName;
	}
	
	@GetMapping("/all")
	public List<User> getAllUser(){
		
		List<User> allUsers = userRepo.findAll();
		
		return allUsers;
	}

}
