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
	@GetMapping("/get/{num}")
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
}
