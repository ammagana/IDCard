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
		return (List<BuildingModel>) building.findAll();
	}
}
