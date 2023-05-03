package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

@Service
public interface UserService {
	
	// cree
	public User createUser(User user);
	
	//lire 
	public List<User> getusers() ;
	//delete

	public User getuserbyId(Long id);
	
	public void deleteUser(Long id);
	
	public User  updateuser(User user , Long id);
}
