
package com.example.footballdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public List<Football> sortStudents(String field)
	{
		return frepo.findAll(Sort.by(field));
	}
	public List<Football> paging(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<Football>foot=frepo.findAll(paging);
		return foot.getContent();
	}
	public List<Football> pagingAndSorting(int offset,int pageSize,String field)
	{
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<Football>foot=frepo.findAll(paging);
		return foot.getContent();
	}
	public List<Football> fetchPlayersByNamePrefix(String prefix)
	{
		return frepo.findByNameStartingWith(prefix);
	}
	public List<Football> fetchPlayersByNameSuffix(String suffix)
	{
		return frepo.findByNameEndingWith(suffix);
	}
}
