package com.armando.project.IdCard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.armando.project.IdCard.Model.ManagerModel;
import com.armando.project.IdCard.Repository.Manager;

@Service
public class ManagerService {
	@Autowired
	Manager manager;
	
	public List<ManagerModel> getAllDepartments(){
		return (List<ManagerModel>) this.manager.findAll();
	}
}
