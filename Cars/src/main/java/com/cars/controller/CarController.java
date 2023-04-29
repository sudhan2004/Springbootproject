package com.cars.controller;

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

import com.cars.modeldata.Cardetails;
import com.cars.service.CarService;


@RestController
public class CarController {
	@Autowired
	CarService cservice;
	@GetMapping("/get")
	public List<Cardetails> getRecords()
	{
		List<Cardetails> values = cservice.getAllRecords(); 
		return values;
	}
	@GetMapping("/get/{sno}")
	public Optional<Cardetails> getRecords(@PathVariable("sno") int sno)
	{
		return cservice.getAllRecords(sno); 
	}
	@PostMapping("/post")
	public Cardetails saveRecords(@RequestBody Cardetails c)
	{
		return cservice.saveRecords(c);
	}
	@PutMapping("/put")
	public Cardetails updateRecords(@RequestBody Cardetails c)
	{
		return cservice.updateRecords(c);
	}
	@DeleteMapping("/delete")
	public void deleteRecords()
	{
		cservice.deleteRecords();
	}
	@DeleteMapping("/delete/{sno}")
	public void deleteRecords(@PathVariable("sno") int sno)
	{
		cservice.deleteRecords(sno);
	}
	@GetMapping("/sort/{field}")
	public List<Cardetails> sortRecords(@PathVariable String field)
	{
		return cservice.sortRecords(field);
	}
	@GetMapping("/get/{offset}/{pageSize}")
	public List<Cardetails> paging(@PathVariable int offset,@PathVariable int pageSize)
	{
		return cservice.paging(offset, pageSize);
	}
	@GetMapping("/get/{offset}/{pageSize}/{field}")
	public List<Cardetails> pagingAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	{
		return cservice.pagingAndSorting(offset, pageSize, field);
	}
	@GetMapping("/get/fetchRecordsByNamePrefix")
	public List<Cardetails> fetchRecordsByNamePrefix(@RequestParam String prefix)
	{
		return cservice.fetchRecordsByNamePrefix(prefix);
	}
	@GetMapping("/get/fetchRecordsByNameSuffix")
	public List<Cardetails> fetchRecordsByNameSuffix(@RequestParam String suffix)
	{
		return cservice.fetchRecordsByNameSuffix(suffix);
	}
}

