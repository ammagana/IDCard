package com.armando.project.IdCard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.armando.project.IdCard.Model.BuildingModel;
import com.armando.project.IdCard.Repository.Building;

@Service
public class BuildingService {
	@Autowired
	private Building building;
		
	public List<BuildingModel> getAll() {
		return building.findAll();
	}
	
	public BuildingModel getById(int id) {
		return building.findById(id);
	}
	
	public void save(BuildingModel building) {
		this.building.save(building);
	}
}
