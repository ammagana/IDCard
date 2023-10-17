package com.armando.project.IdCard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armando.project.IdCard.Model.UserModel;
import com.armando.project.IdCard.Service.UserService;

@RestController("User")
@RequestMapping("/user")
public class UserController {
	private UserService user;
	
	@Autowired
	public UserController(UserService user) {
		this.user = user;
	}
	
	@GetMapping("/all")
	public List<UserModel> getAll(){
		return this.user.getAll();
	}
	

}
