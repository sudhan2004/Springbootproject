package com.example.footballdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.footballdemo.footballdata.Registration;

@Repository

public interface RegistrationRepository extends JpaRepository<Registration,Integer>{
	List<Registration> findByfirstnameStartingWith(String prefix);
	List<Registration> findByfirstnameEndingWith(String suffix);
}
