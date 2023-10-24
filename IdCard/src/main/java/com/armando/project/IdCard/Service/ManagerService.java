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
	
	public List<ManagerModel> getAll(){
		return this.manager.findAll();
	}
	
	public ManagerModel getById(int id) {
		return this.manager.findById(id);
	}
	
	public void save(ManagerModel manager) {
		this.manager.save(manager);
	}
}
