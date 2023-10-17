package com.armando.project.IdCard.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.armando.project.IdCard.Model.DepartmentModel;

@Repository
public interface Department extends CrudRepository<DepartmentModel, Integer>{

}
