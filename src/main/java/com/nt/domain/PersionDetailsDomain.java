package com.nt.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class PersionDetailsDomain {
	private String fname;
	private String lname;
	private String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dob;
	private String gender;
	private Long adharno;
	private Date createdate;
	private Date upadedate;
}
