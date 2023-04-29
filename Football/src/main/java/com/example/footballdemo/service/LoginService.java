package com.example.footballdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.footballdemo.footballdata.LoginFootball;
import com.example.footballdemo.repository.LoginRepository;

@Service

public class LoginService {
	@Autowired
	LoginRepository lrepo;
	public List<LoginFootball> getAllRecords()
	{
		List<LoginFootball> value = lrepo.findAll();
		return value;
	}
	public Optional<LoginFootball> getAllRecords(int num)
	{
		return lrepo.findById(num);
	}
	public LoginFootball saveRecords(LoginFootball f)
	{
		return lrepo.save(f);
	}
	public LoginFootball updateRecords(LoginFootball f)
	{
		return lrepo.save(f);
	}
	public void deleteRecords()
	{
		lrepo.deleteAll();
	}
	public void deleteRecords(int num)
	{
		lrepo.deleteById(num);
	}
	public List<LoginFootball> sortStudents(String field)
	{
		return lrepo.findAll(Sort.by(field));
	}
	public List<LoginFootball> paging(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<LoginFootball>foot=lrepo.findAll(paging);
		return foot.getContent();
	}
	public List<LoginFootball> pagingAndSorting(int offset,int pageSize,String field)
	{
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<LoginFootball>foot=lrepo.findAll(paging);
		return foot.getContent();
	}
	public String loginCheckData(String uname,String password)
	{
		LoginFootball user = lrepo.findByuname(uname);
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
