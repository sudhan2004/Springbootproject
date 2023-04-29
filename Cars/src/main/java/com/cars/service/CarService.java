package com.cars.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cars.modeldata.Cardetails;
import com.cars.repository.CarRepository;

@Service

public class CarService {
	@Autowired
	CarRepository crepo;
	public List<Cardetails> getAllRecords()
	{
		List<Cardetails> value = crepo.findAll();
		return value;
	}
	public Optional<Cardetails> getAllRecords(int sno)
	{
		return crepo.findById(sno);
	}
	public Cardetails saveRecords(Cardetails c)
	{
		return crepo.save(c);
	}
	public Cardetails updateRecords(Cardetails c)
	{
		return crepo.save(c);
	}
	public void deleteRecords()
	{
		crepo.deleteAll();
	}
	public void deleteRecords(int sno)
	{
		crepo.deleteById(sno);
	}
	public List<Cardetails> sortRecords(String field)
	{
		return crepo.findAll(Sort.by(field));
	}
	public List<Cardetails> paging(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<Cardetails>foot=crepo.findAll(paging);
		return foot.getContent();
	}
	public List<Cardetails> pagingAndSorting(int offset,int pageSize,String field)
	{
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<Cardetails>foot=crepo.findAll(paging);
		return foot.getContent();
	}
	public List<Cardetails> fetchRecordsByNamePrefix(String prefix)
	{
		return crepo.findByBrandStartingWith(prefix);
	}
	public List<Cardetails> fetchRecordsByNameSuffix(String suffix)
	{
		return crepo.findByBrandEndingWith(suffix);
	}
}
