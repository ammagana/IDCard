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
		return (List<UserModel>) this.user.findAll();
	}
}
