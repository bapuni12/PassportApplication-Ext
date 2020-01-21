package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DEGREE_MASTER")
public class HighestDegreeEntity {
	@Id
	@Column(name = "DEGREEID")
	private int DEGREEID;
	@Column(name = "DEGREENAME")
	private String DEGREENAME;

}
