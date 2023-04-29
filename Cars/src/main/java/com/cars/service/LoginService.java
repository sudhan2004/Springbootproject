package com.cars.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.modeldata.Logindetails;
import com.cars.repository.LoginRepository;

@Service

public class LoginService {
	@Autowired
	LoginRepository crepo;
	public List<Logindetails> getAllRecords()
	{
		List<Logindetails> value = crepo.findAll();
		return value;
	}
	public Optional<Logindetails> getAllRecords(int sno)
	{
		return crepo.findById(sno);
	}
	public Logindetails saveRecords(Logindetails c)
	{
		return crepo.save(c);
	}
	public Logindetails updateRecords(Logindetails c)
	{
		return crepo.save(c);
	}
	public void deleteRecords(int sno)
	{
		crepo.deleteById(sno);
	}
	public String loginCheckData(String username,String password)
	{
		Logindetails user = crepo.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
}
