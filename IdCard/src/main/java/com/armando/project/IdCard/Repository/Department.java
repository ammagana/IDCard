package com.armando.project.IdCard.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armando.project.IdCard.Model.DepartmentModel;

@Repository("department")
public interface Department extends CrudRepository<DepartmentModel, Integer>{
	public List<DepartmentModel> findAll();
	public DepartmentModel findById(int id);
	public DepartmentModel findByName(String name);
}
