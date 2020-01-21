package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.PassoutYearEntity;

public interface PassoutyearRepository  extends JpaRepository<PassoutYearEntity, Integer>{
	
	@Query( "select YEAR from PassoutYearEntity")
	List<Integer> fetchyear();
}
