package com.armando.project.IdCard.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armando.project.IdCard.Model.UserModel;

@Repository("user")
public interface User extends CrudRepository<UserModel, Integer>{
	public List<UserModel> findAll();
	public UserModel findById(int id);
}
