package com.armando.project.IdCard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.armando.project.IdCard.Model.UserModel;
import com.armando.project.IdCard.Repository.User;

@Service
public class UserService {
	@Autowired
	User user;
	
	public List<UserModel> getAll(){
		return this.user.findAll();
	}
	
	public UserModel getById(int id) {
		return this.user.findById(id);
	}
	
	public void save(UserModel user) {
		this.user.save(user);
	}
}
