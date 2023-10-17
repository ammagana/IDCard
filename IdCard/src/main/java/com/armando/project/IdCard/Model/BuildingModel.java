package com.armando.project.IdCard.Model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public class BuildingModel {
	@Id
	private int ID;
	@Column("name")
	private String name;
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ID, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuildingModel other = (BuildingModel) obj;
		return ID == other.ID && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Building [ID=" + ID + ", name=" + name + "]";
	}
	
}
