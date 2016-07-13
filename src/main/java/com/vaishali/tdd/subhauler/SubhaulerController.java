package com.vaishali.tdd.subhauler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubhaulerController {
	@Autowired
	private SubhaulerService subhaulerService;
	
	public SubhaulerController(SubhaulerService subhaulerService) {
		super();
		this.subhaulerService = subhaulerService;
	}


	@RequestMapping("/retreive")
	public ResponseEntity<String> getAll() {
		//System.out.println(data);
		return new ResponseEntity<String>(subhaulerService.getAll(), HttpStatus.OK);
	}

}
