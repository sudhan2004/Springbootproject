package com.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.modeldata.Registrationdetails;

@Repository
public interface RegistrationRepository extends JpaRepository<Registrationdetails,Integer>{

}
