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

import com.example.footballdemo.footballdata.Football;
import com.example.footballdemo.service.FootballService;

@RestController
public class FootballController {
	@Autowired
	FootballService fservice;
	@GetMapping("/get")
	public List<Football> getRecords()
	{
		List<Football> values = fservice.getAllRecords(); 
		return values;
	}
	@GetMapping("/get/{num} ")
	public Optional<Football> getRecords(@PathVariable("num") int num)
	{
		return fservice.getAllRecords(num); 
	}
	@PostMapping("/post")
	public Football saveRecords(@RequestBody Football f)
	{
		return fservice.saveRecords(f);
	}
	@PutMapping("/put")
	public Football updateRecords(@RequestBody Football f)
	{
		return fservice.updateRecords(f);
	}
	@DeleteMapping("/delete")
	public void deleteRecords()
	{
		fservice.deleteRecords();
	}
	@DeleteMapping("/delete/{num}")
	public void deleteRecords(@PathVariable("num") int num)
	{
		fservice.deleteRecords(num);
	}
	@GetMapping("/get/{field}")
	public List<Football> sortStudents(@PathVariable String field)
	{
		return fservice.sortStudents(field);
	}
	@GetMapping("/get/{offset}/{pageSize}")
	public List<Football> paging(@PathVariable int offset,@PathVariable int pageSize)
	{
		return fservice.paging(offset, pageSize);
	}
	@GetMapping("/get/{offset}/{pageSize}/{field}")
	public List<Football> pagingAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	{
		return fservice.pagingAndSorting(offset, pageSize, field);
	}
	@GetMapping("/get/fetchPlayersByNamePrefix")
	public List<Football> fetchPlayersByNamePrefix(@RequestParam String prefix)
	{
		return fservice.fetchPlayersByNamePrefix(prefix);
	}
	@GetMapping("/get/fetchPlayersByNameSuffix")
	public List<Football> fetchPlayersByNameSuffix(@RequestParam String suffix)
	{
		return fservice.fetchPlayersByNameSuffix(suffix);
	}
}
