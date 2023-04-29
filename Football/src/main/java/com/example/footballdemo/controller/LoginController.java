package com.example.footballdemo.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.footballdemo.footballdata.LoginFootball;
import com.example.footballdemo.service.LoginService;

@RestController

public class LoginController {
	@Autowired
	LoginService lservice;
	@GetMapping("/lget")
	public List<LoginFootball> getRecords()
	{
		List<LoginFootball> values = lservice.getAllRecords(); 
		return values;
	}
	@GetMapping("/lget/{num} ")
	public Optional<LoginFootball> getRecords(@PathVariable("num") int num)
	{
		return lservice.getAllRecords(num); 
	}
	@PostMapping("/lpost")
	public LoginFootball saveRecords(@RequestBody LoginFootball f)
	{
		return lservice.saveRecords(f);
	}
	@PutMapping("/lput")
	public LoginFootball updateRecords(@RequestBody LoginFootball f)
	{
		return lservice.updateRecords(f);
	}
	@DeleteMapping("/ldelete")
	public void deleteRecords()
	{
		lservice.deleteRecords();
	}
	@DeleteMapping("/ldelete/{num}")
	public void deleteRecords(@PathVariable("num") int num)
	{
		lservice.deleteRecords(num);
	}
	@GetMapping("/lget/{field}")
	public List<LoginFootball> sortStudents(@PathVariable String field)
	{
		return lservice.sortStudents(field);
	}
	@GetMapping("/lget/{offset}/{pageSize}")
	public List<LoginFootball> paging(@PathVariable int offset,@PathVariable int pageSize)
	{
		return lservice.paging(offset, pageSize);
	}
	@GetMapping("/get/{offset}/{pageSize}/{field}")
	public List<LoginFootball> pagingAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	{
		return lservice.pagingAndSorting(offset, pageSize, field);
	}
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username = loginDataMap.get("username");
		String password = loginDataMap.get("password");
		String result = lservice.loginCheckData(username, password);
		return result;
	}
}
