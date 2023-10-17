package com.armando.project.IdCard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.armando.project.IdCard.Model.DepartmentModel;
import com.armando.project.IdCard.Repository.Department;

@Service
public class DepartmentService {
	@Autowired
	Department department;
	
	public List<DepartmentModel> getAllDepartments(){
		return (List<DepartmentModel>) this.department.findAll();
	}
}
