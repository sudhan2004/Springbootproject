package com.cars.controller;

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

import com.cars.modeldata.Logindetails;
import com.cars.service.LoginService;


@RestController
public class LoginController {
	@Autowired
	LoginService cservice;
	@GetMapping("/lget")
	public List<Logindetails> getRecords()
	{
		List<Logindetails> values = cservice.getAllRecords(); 
		return values;
	}
	@GetMapping("/lget/{sno}")
	public Optional<Logindetails> getRecords(@PathVariable("sno") int sno)
	{
		return cservice.getAllRecords(sno); 
	}
	@PostMapping("/lpost")
	public Logindetails saveRecords(@RequestBody Logindetails c)
	{
		return cservice.saveRecords(c);
	}
	@PutMapping("/lput")
	public Logindetails updateRecords(@RequestBody Logindetails c)
	{
		return cservice.updateRecords(c);
	}
	@DeleteMapping("/ldelete/{sno}")
	public void deleteRecords(@PathVariable("sno") int sno)
	{
		cservice.deleteRecords(sno);
	}
	@PostMapping("/llogin")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username = loginDataMap.get("username");
		String password = loginDataMap.get("password");
		String result = cservice.loginCheckData(username, password);
		return result;
	}
}

