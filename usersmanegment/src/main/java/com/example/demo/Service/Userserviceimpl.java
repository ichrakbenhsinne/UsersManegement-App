package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class Userserviceimpl implements UserService {

	@Autowired
	private UserRepository ur;
	
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return ur.save(user);
	}

	@Override
	public List<User> getusers() {
		// TODO Auto-generated method stub
		return (List<User>) ur.findAll();
	}

	@Override
	public User getuserbyId(Long id) {
		// TODO Auto-generated method stub
		return ur.findById(id).get();
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
	
		ur.deleteById(id);
		
	}

	@Override
	public User updateuser(User user, Long id) {
		// TODO Auto-generated method stub
		User u=ur.findById(id).get();
				
		u.setName(u.getName());
		u.setEmail(u.getEmail());
		u.setAddress(u.getAddress());
		u.setpNo(u.getpNo());
		return ur.save(u);
	}

}
