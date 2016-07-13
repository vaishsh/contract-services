package com.vaishali.tdd.subhauler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(MockitoJUnitRunner.class)
@SpringApplicationConfiguration(classes = SubhaulerApplication.class)
public class SubhaulerControllerTests {
	//@InjectMocks
	private SubhaulerController subhaulerController;
	
	@Before
	public void setup(){
		subhaulerController = new SubhaulerController(subhaulerService); 
	}
	
	@Mock
	private SubhaulerService subhaulerService;

	@Test
	public void shouldReturnOKForValidRequests() {
		alwaysReturnHardcodedDataFromSubhaulerService();
		ResponseEntity<String> response = subhaulerController.getAll();
		assertNotNull("response should not be null", response);
		assertEquals("response should be OK", HttpStatus.OK, response.getStatusCode());
	}

	private void alwaysReturnHardcodedDataFromSubhaulerService() {
		// TODO Auto-generated method stub
		
	}

}
