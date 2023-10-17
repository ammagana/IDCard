package com.armando.project.IdCard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armando.project.IdCard.Model.BuildingModel;
import com.armando.project.IdCard.Service.BuildingService;

@RestController("Building")
@RequestMapping(path="/building")
public class BuildingController {
	
	private BuildingService building;
	
	@Autowired
	public BuildingController(BuildingService building) {
		this.building = building;
	}
	
	@GetMapping("/all")
	public List<BuildingModel> getAll(){
		return this.building.getAll();
	}
	
}
