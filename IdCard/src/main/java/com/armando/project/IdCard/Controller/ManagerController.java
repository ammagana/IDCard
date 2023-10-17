package com.armando.project.IdCard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armando.project.IdCard.Model.ManagerModel;
import com.armando.project.IdCard.Service.ManagerService;

@RestController("Manager")
@RequestMapping("/manager")
public class ManagerController {
	private ManagerService manager;
	
	@Autowired
	public ManagerController(ManagerService manager) {
		this.manager = manager;
	}
	
	@GetMapping("/all")
	public List<ManagerModel> getAll(){
		return this.manager.getAllDepartments();
	}
}
