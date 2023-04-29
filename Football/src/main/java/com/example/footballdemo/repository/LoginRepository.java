package com.example.footballdemo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.footballdemo.footballdata.LoginFootball;

@Repository

public interface LoginRepository extends JpaRepository<LoginFootball,Integer>{
	LoginFootball findByuname(String uname);

}
