package com.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.modeldata.Logindetails;

@Repository
public interface LoginRepository extends JpaRepository<Logindetails,Integer>{
	Logindetails findByusername(String username);

}
