package com.armando.project.IdCard.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armando.project.IdCard.Model.ManagerModel;

@Repository
public interface Manager extends CrudRepository<ManagerModel, Integer>{

}
