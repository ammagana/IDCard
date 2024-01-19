package com.armando.project.IdCard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.armando.project.IdCard.Repository.Building;

@SpringBootTest
class IdCardApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private Building repoBuilding;
	
	@Test
	void contextLoads() {
	}

	public void getBuildings() throws Exception{
		
	}

}
