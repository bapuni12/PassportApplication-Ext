package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "UNIVERSITY_MASTER")
public class UniversityEntity {
	@Id
	@Column(name = "UNVERSITYID")
	private int universityid;
	@Column(name = "UNIVERSITYNAME")
	private String UNIVERSITYNAME;

}
