package com.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cars.modeldata.Cardetails;

import java.util.List;
@Repository

public interface CarRepository extends JpaRepository<Cardetails,Integer> {
	List<Cardetails> findByBrandStartingWith(String prefix);
	List<Cardetails> findByBrandEndingWith(String suffix);
//	List<Football> findByDepartment(String dept);
}