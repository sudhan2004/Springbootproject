package com.cars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cars.modeldata.Registrationdetails;
import com.cars.service.RegistrationService;


@RestController

public class RegistrationController {
	@Autowired
	RegistrationService rservice;
	@GetMapping("/rget")
	public List<Registrationdetails> getRecords()
	{
		List<Registrationdetails> values = rservice.getAllRecords(); 
		return values;
	}
	@PostMapping("/rpost")
	public Registrationdetails saveRecords(@RequestBody Registrationdetails c)
	{
		return rservice.saveRecords(c);
	}
	@PutMapping("/rput")
	public Registrationdetails updateRecords(@RequestBody Registrationdetails c)
	{
		return rservice.updateRecords(c);
	}
	@DeleteMapping("/rdelete/{sno}")
	public void deleteRecords(@PathVariable("sno") int sno)
	{
		rservice.deleteRecords(sno);
	}
}
