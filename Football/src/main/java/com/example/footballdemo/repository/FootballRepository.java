package com.example.footballdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.example.footballdemo.footballdata.Football;
import java.util.List;
@Repository

public interface FootballRepository extends JpaRepository<Football,Integer> {
	List<Football> findByNameStartingWith(String prefix);
	List<Football> findByNameEndingWith(String suffix);
//	List<Football> findByDepartment(String dept);
}
