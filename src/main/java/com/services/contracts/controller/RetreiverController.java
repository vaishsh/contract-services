package com.services.contracts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.contracts.dto.Subhauler;
import com.services.contracts.service.RetreiverService;



@RestController
public class RetreiverController {

	@Autowired
	private RetreiverService retreiverService;

	@RequestMapping("/retreive")
	public Iterable<Subhauler> getSubhaulerDetails(){
		return retreiverService.getSubhaulerDetails();
	}
}
