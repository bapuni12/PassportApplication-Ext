package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.EducationDetailsEntity;

@Repository
public interface EducationDetailsRepository extends JpaRepository<EducationDetailsEntity, Integer> {

}
