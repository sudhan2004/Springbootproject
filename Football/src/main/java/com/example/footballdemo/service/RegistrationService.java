package com.example.footballdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.footballdemo.footballdata.Registration;
import com.example.footballdemo.repository.RegistrationRepository;

@Service

public class RegistrationService {
	@Autowired
	RegistrationRepository rrepo;
	public List<Registration> getAllRecords()
	{
		List<Registration> value = rrepo.findAll();
		return value;
	}
	public Optional<Registration> getAllRecords(int num)
	{
		return rrepo.findById(num);
	}
	public Registration saveRecords(Registration f)
	{
		return rrepo.save(f);
	}
	public Registration updateRecords(Registration f)
	{
		return rrepo.save(f);
	}
	public void deleteRecords()
	{
		rrepo.deleteAll();
	}
	public void deleteRecords(int num)
	{
		rrepo.deleteById(num);
	}
	public List<Registration> sortStudents(String field)
	{
		return rrepo.findAll(Sort.by(field));
	}
	public List<Registration> paging(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<Registration>foot=rrepo.findAll(paging);
		return foot.getContent();
	}
	public List<Registration> pagingAndSorting(int offset,int pageSize,String field)
	{
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<Registration>foot=rrepo.findAll(paging);
		return foot.getContent();
	}
	public List<Registration> fetchPlayersByNamePrefix(String prefix)
	{
		return rrepo.findByfirstnameStartingWith(prefix);
	}
	public List<Registration> fetchPlayersByNameSuffix(String suffix)
	{
		return rrepo.findByfirstnameEndingWith(suffix);
	}
}
