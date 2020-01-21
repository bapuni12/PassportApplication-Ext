package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.PersionDetailsEntity;
@Repository
public interface PassportAppRepository extends JpaRepository<PersionDetailsEntity, Integer>  {
	

}
