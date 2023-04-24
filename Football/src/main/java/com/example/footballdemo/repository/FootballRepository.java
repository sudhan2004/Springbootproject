package com.example.footballdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.footballdemo.footballdata.Football;

@Repository

public interface FootballRepository extends JpaRepository<Football,Integer> {

}
