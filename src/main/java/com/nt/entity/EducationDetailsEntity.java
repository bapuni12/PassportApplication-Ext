package com.nt.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table( name = "EDUCATION_DETAILS")
@Data
public class EducationDetailsEntity {
	@Id
	@GeneratedValue
	@Column(name = "EDUCATION_ID")
	private Integer educationid;
	@Column(name = "HIGHEST_DEGREE")
	private String highest_degree;
	@Column(name = "UNIVERSITY")
	private String university;
	@Column(name = "YEAR")
	private Integer year;
	@Column(name = "PERSION_ID")
	private Integer pid;
	@Column(name = "CREATE_DATE")
	@CreationTimestamp
	private Date create_date;
	@Column(name = "UPDATE_DATE")
	@UpdateTimestamp
	private Date update_date;
}
