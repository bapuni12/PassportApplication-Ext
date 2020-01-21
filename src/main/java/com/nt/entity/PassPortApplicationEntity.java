package com.nt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "PASSPORT_DETAILS")
public class PassPortApplicationEntity {
	@Id
	@GeneratedValue
	@Column(name = "PASSPORT_ID")
	private int passid;
	@Column(name = "PASSPORT_NUMBER")
	private String passportnumber;
	@Column(name = "PERSION_ID")
	private Integer pid;
	@Column(name = "CREATE_DATE",nullable =false,updatable = false)
	@CreationTimestamp
    private Date createdate;
	@UpdateTimestamp
    @Column(name = "UPDATE_DATE")
    private Date updatedate;
}
