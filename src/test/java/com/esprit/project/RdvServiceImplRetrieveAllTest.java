package com.esprit.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.project.service.IGestionRdv;




@RunWith(SpringRunner.class)
@SpringBootTest
public class RdvServiceImplRetrieveAllTest {
	
	//private static final Logger l = LogManager.getLogger(AccountServiceImpl.class);
	@Autowired 
	IGestionRdv gr;
	
	@Test
	public void test() {
		gr.retrieveAllRdvs();
	}
	
}
