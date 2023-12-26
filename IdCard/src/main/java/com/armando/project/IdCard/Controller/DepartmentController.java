package com.armando.project.IdCard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armando.project.IdCard.Model.DepartmentModel;
import com.armando.project.IdCard.Service.DepartmentService;

@RestController("Department")
@RequestMapping(path="/department")
public class DepartmentController {

		private DepartmentService department;
		
		@Autowired
		public DepartmentController(DepartmentService department) {
			this.department = department;
		}
		
		@GetMapping("/all")
		public List<DepartmentModel> getAll(){
			return this.department.getAll();
		}
		
		@GetMapping("/{id}")
		public DepartmentModel getById(@PathVariable int id) {
			return this.department.getById(id);
		}
		
		
		
}
