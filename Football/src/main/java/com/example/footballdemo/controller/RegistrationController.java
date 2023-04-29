package com.example.footballdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.footballdemo.footballdata.Registration;
import com.example.footballdemo.service.RegistrationService;

@RestController

public class RegistrationController {
	@Autowired
	RegistrationService rservice;
	@GetMapping("/rget")
	public List<Registration> getRecords()
	{
		List<Registration> values = rservice.getAllRecords(); 
		return values;
	}
	@GetMapping("/rget/{num} ")
	public Optional<Registration> getRecords(@PathVariable("num") int num)
	{
		return rservice.getAllRecords(num); 
	}
	@PostMapping("/rpost")
	public Registration saveRecords(@RequestBody Registration f)
	{
		return rservice.saveRecords(f);
	}
	@PutMapping("/rput")
	public Registration updateRecords(@RequestBody Registration f)
	{
		return rservice.updateRecords(f);
	}
	@DeleteMapping("/rdelete")
	public void deleteRecords()
	{
		rservice.deleteRecords();
	}
	@DeleteMapping("/rdelete/{num}")
	public void deleteRecords(@PathVariable("num") int num)
	{
		rservice.deleteRecords(num);
	}
	@GetMapping("/rget/{field}")
	public List<Registration> sortStudents(@PathVariable String field)
	{
		return rservice.sortStudents(field);
	}
	@GetMapping("/rget/{offset}/{pageSize}")
	public List<Registration> paging(@PathVariable int offset,@PathVariable int pageSize)
	{
		return rservice.paging(offset, pageSize);
	}
	@GetMapping("/rget/{offset}/{pageSize}/{field}")
	public List<Registration> pagingAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	{
		return rservice.pagingAndSorting(offset, pageSize, field);
	}
	@GetMapping("/rget/fetchPlayersByNamePrefix")
	public List<Registration> fetchPlayersByNamePrefix(@RequestParam String prefix)
	{
		return rservice.fetchPlayersByNamePrefix(prefix);
	}
	@GetMapping("/rget/fetchPlayersByNameSuffix")
	public List<Registration> fetchPlayersByNameSuffix(@RequestParam String suffix)
	{
		return rservice.fetchPlayersByNameSuffix(suffix);
	}
}
