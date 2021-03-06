package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.PassPortApplicationEntity;

@Repository
public interface PassPortDetailsRepository extends JpaRepository<PassPortApplicationEntity, Integer> {

}
