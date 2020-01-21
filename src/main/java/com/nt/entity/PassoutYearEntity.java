package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PASSOUT_YEAR")
public class PassoutYearEntity {
	
	@Id
	@Column(name = "YEARID")
	private Integer yearid;
	@Column(name = "YEAR")
	private Integer YEAR;

}
