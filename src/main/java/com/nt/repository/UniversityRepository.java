package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.UniversityEntity;

public interface UniversityRepository extends JpaRepository<UniversityEntity, Integer> {
	
	@Query( "select UNIVERSITYNAME from UniversityEntity ")
	public List<String> featchuniversity();
	
	

}
