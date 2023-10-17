package com.armando.project.IdCard.Model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("department")
public class DepartmentModel {
	@Id
	private int id;
	@Column("departmentName")
	private String departmentName;
	@Column("building")
	private int building;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public int getBuilding() {
		return building;
	}
	
	public void setBuilding(int building) {
		this.building = building;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(building, departmentName, id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartmentModel other = (DepartmentModel) obj;
		return building == other.building && Objects.equals(departmentName, other.departmentName) && id == other.id;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", building=" + building + "]";
	}
	
	
}
