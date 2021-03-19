package com.esprit.project;


//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.project.service.IDelegateService;
//import com.esprit.project.service.IParentService;
//import com.esprit.project.service.UserServiceImpl;




@RunWith(SpringRunner.class)
@SpringBootTest
public class DelegateServiceImplDeleteTest {
	
	//private static final Logger l = LogManager.getLogger(UserServiceImpl.class);
	@Autowired 
	IDelegateService delegate;
	
	@Test
	public void test() {
		delegate.deleteDelegate("2");
	}

}
