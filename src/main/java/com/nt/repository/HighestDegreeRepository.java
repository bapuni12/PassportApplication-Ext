package com.nt.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.nt.entity.HighestDegreeEntity;

public interface HighestDegreeRepository extends JpaRepository<HighestDegreeEntity, Integer>{
	
	
	@Query( "select DEGREENAME from HighestDegreeEntity ")
	public List<String> featchDegree();
	
}
