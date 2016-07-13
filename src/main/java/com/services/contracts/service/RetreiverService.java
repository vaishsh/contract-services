package com.services.contracts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.contracts.dto.Subhauler;
import com.services.contracts.repository.SubhaulerRepository;

@Service
public class RetreiverService {

	
	@Autowired //Create a singleton will be used for all the request
	public SubhaulerRepository subhaulerRepository;
	
	public Iterable<Subhauler> getSubhaulerDetails(){
		Iterable<Subhauler> allSubhaulers=subhaulerRepository.findAll();
		return allSubhaulers;
	}
}
