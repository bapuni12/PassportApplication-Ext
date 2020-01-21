package com.nt.service;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nt.domain.EducationDetailsDomain;
import com.nt.domain.PassportDetailsDomain;
import com.nt.domain.PersionDetailsDomain;
import com.nt.entity.EducationDetailsEntity;
import com.nt.entity.PassPortApplicationEntity;
import com.nt.entity.PersionDetailsEntity;
import com.nt.repository.EducationDetailsRepository;
import com.nt.repository.HighestDegreeRepository;
import com.nt.repository.PassPortDetailsRepository;
import com.nt.repository.PassoutyearRepository;
import com.nt.repository.PassportAppRepository;
import com.nt.repository.UniversityRepository;

@Service
public class PersionDetailsMgmtServiceImpl implements PersionDetailsService {
	
	@Autowired
	private PassportAppRepository repo;
	@Autowired
	private EducationDetailsRepository edurepo;
	@Autowired
	private HighestDegreeRepository hdrepo;
	@Autowired
	private UniversityRepository unirepo;
	@Autowired
	private PassoutyearRepository pyrepo;
	
	@Autowired
	private PassPortDetailsRepository passdetailsrepo;

	static final String AB="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static SecureRandom random= new SecureRandom();
	@Override
	public int insertpersiondetails(PersionDetailsDomain domain) {
		PersionDetailsEntity entity=null;
		entity= new PersionDetailsEntity();
		BeanUtils.copyProperties(domain, entity);
		PersionDetailsEntity save= repo.save(entity);
		return save.getPid();
	}

	@Override
	public Optional<PersionDetailsEntity> featchdataById(Integer pid) {
		return repo.findById(pid);
	}

	@Override
	public EducationDetailsDomain saveEducationDetails(EducationDetailsDomain domain) {
		EducationDetailsEntity entity= null;
		entity= new EducationDetailsEntity();
		BeanUtils.copyProperties(domain, entity);
		if(entity!=null) {
			EducationDetailsEntity save=edurepo.save(entity);
			BeanUtils.copyProperties(save, domain);
			System.out.println(save);
			System.out.println(domain);
		}
		return domain;
	}
	@Override
	public Optional<EducationDetailsEntity> getdataById(Integer pid) {
		return edurepo.findById(pid);
	}

	@Override
	public List<String> getallhighestdegree() {
		return hdrepo.featchDegree();
	}

	@Override
	public List<String> getalluniversity() {
		// TODO Auto-generated method stub
		return unirepo.featchuniversity();
	}

	@Override
	public List<Integer> getallyear() {
		return pyrepo.fetchyear();
	}

	@Override
	public PassportDetailsDomain savePassportDetails(PassportDetailsDomain domain) {
		PassPortApplicationEntity entity=null;
		entity= new PassPortApplicationEntity();
		BeanUtils.copyProperties(domain, entity);
		entity.setPassportnumber(generateRandomPassword(7));
		entity=passdetailsrepo.save(entity);
		if(entity!=null) {
			BeanUtils.copyProperties(entity, domain);
		}
		return domain;
	}
	
	
	private String generateRandomPassword(int len) {
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(random.nextInt(AB.length())));
		return sb.toString();
	}	
} 
