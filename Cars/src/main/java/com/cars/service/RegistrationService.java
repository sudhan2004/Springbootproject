package com.cars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.modeldata.Registrationdetails;
import com.cars.repository.RegistrationRepository;

@Service

public class RegistrationService {
	@Autowired
	RegistrationRepository crepo;
	public List<Registrationdetails> getAllRecords()
	{
		List<Registrationdetails> value = crepo.findAll();
		return value;
	}
	public Registrationdetails saveRecords(Registrationdetails c)
	{
		return crepo.save(c);
	}
	public Registrationdetails updateRecords(Registrationdetails c)
	{
		return crepo.save(c);
	}
	public void deleteRecords(int sno)
	{
		crepo.deleteById(sno);
	}
}
