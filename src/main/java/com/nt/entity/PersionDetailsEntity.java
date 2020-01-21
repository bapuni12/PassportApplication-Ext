package com.nt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "PERSION_DETAILS")
public class PersionDetailsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSION_SEQ")
	@SequenceGenerator(name="PERSION_SEQ", sequenceName="PERSION_SEQ", allocationSize=1)
	@Column(name = "PERSION_ID")
	private Integer pid;
    @Column(name = "FIRSTNAME")
	private String fname;
    @Column(name = "LASTNAME")
    private String lname;
    @Column(name = "EMAIL",length = 35)
	private String email;
    @Column(name = "DATA_OF_BIRTH",length = 20) 
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date   dob;
    @Column(name = "GENDER")
	private String gender;
    @Column(name = "ADHAR_NO")
	private Long adharno;
    @Column(name = "CREATE_DATE",nullable =false,updatable = false)
    @CreationTimestamp
    private Date createdate;
    @Column(name = "UPDATE_DATE")
    @UpdateTimestamp
    private Date updatedate;
}
