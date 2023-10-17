package com.armando.project.IdCard.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armando.project.IdCard.Model.UserModel;

@Repository
public interface User extends CrudRepository<UserModel, Integer>{

}
