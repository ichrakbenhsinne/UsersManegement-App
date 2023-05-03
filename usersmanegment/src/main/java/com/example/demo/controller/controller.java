package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import com.jayway.jsonpath.internal.Path;

@RestController
@CrossOrigin
public class controller {

	
	@Autowired
	private UserService us;
	
	@GetMapping("/hello")
	public String sayhello()
	{
		return "hello world";
	}
	
	//create user
	@PostMapping("/add")
	public User createUser(@RequestBody User user)
	{
	  User u=	us.createUser(user);
	  return u;
		
	}
	
	@GetMapping("/users")
	public List<User> getusers()
	{
		return us.getusers();
	}
	
	@PutMapping("/update/{id}")
	public User updateUserById(@RequestBody User user , @PathVariable("id") Long id)
	{
		User u=us.updateuser(user, id);
		return u;
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") Long id)
	{
		 us.deleteUser(id);
		 return ("user deleted !");
		
		
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") Long id)
	{
		return us.getuserbyId(id);
		
	}
	
	
	
	
}
