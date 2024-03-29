package com.armando.project.IdCard.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armando.project.IdCard.Model.BuildingModel;

@Repository("building")
public interface Building extends CrudRepository<BuildingModel, Integer>{

}
