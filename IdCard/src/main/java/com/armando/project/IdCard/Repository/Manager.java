package com.armando.project.IdCard.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armando.project.IdCard.Model.ManagerModel;

@Repository("manager")
public interface Manager extends CrudRepository<ManagerModel, Integer>{
	public List<ManagerModel> findAll();
	public ManagerModel findById(int id);
	public List<ManagerModel> findByName(String name);
}
