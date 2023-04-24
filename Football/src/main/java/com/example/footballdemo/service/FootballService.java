
package com.example.footballdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.footballdemo.footballdata.Football;
import com.example.footballdemo.repository.FootballRepository;

@Service

public class FootballService {
	@Autowired
	FootballRepository frepo;
	public List<Football> getAllRecords()
	{
		List<Football> value = frepo.findAll();
		return value;
	}
	public Optional<Football> getAllRecords(int num)
	{
		return frepo.findById(num);
	}
	public Football saveRecords(Football f)
	{
		return frepo.save(f);
	}
	public Football updateRecords(Football f)
	{
		return frepo.save(f);
	}
	public void deleteRecords()
	{
		frepo.deleteAll();
	}
	public void deleteRecords(int num)
	{
		frepo.deleteById(num);
	}
}
