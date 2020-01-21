package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.domain.EducationDetailsDomain;
import com.nt.domain.PassportDetailsDomain;
import com.nt.domain.PersionDetailsDomain;
import com.nt.entity.EducationDetailsEntity;
import com.nt.entity.PersionDetailsEntity;

public interface PersionDetailsService {
	
	int insertpersiondetails(PersionDetailsDomain domain);
	public Optional<PersionDetailsEntity> featchdataById(Integer pid);
	
	EducationDetailsDomain saveEducationDetails(EducationDetailsDomain domain);
	Optional<EducationDetailsEntity> getdataById(Integer pid);
	
	List<String> getallhighestdegree();
	List<String> getalluniversity();
	List<Integer> getallyear();
	
	PassportDetailsDomain savePassportDetails(PassportDetailsDomain domain);

}
