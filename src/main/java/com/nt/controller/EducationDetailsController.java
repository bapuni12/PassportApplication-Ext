package com.nt.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.domain.EducationDetailsDomain;
import com.nt.entity.EducationDetailsEntity;
import com.nt.entity.PersionDetailsEntity;
import com.nt.service.PersionDetailsService;

@Controller
public class EducationDetailsController {
	
	@Autowired
	private PersionDetailsService service;
	
	
	@RequestMapping(value = "/education",method = RequestMethod.GET)
	public String educationform(Model model,HttpServletRequest req) {
		EducationDetailsDomain domain=null;
		domain= new EducationDetailsDomain();
		String edudetails=req.getParameter("pid");
		if(!edudetails.isEmpty() && edudetails!="null" ) {
			int pid=Integer.parseInt(edudetails);
			domain.setPid(pid);
		}
		List<String> degreelist=service.getallhighestdegree();
		model.addAttribute("degreelist", degreelist);
		List<String> alluniversitylist=service.getalluniversity();
		model.addAttribute("alluniversity", alluniversitylist);
		List<Integer>allyear= service.getallyear();
		model.addAttribute("allyear", allyear);
		model.addAttribute("educationdetails", domain);
		return "Education_Details";
	}
	@RequestMapping(value = "/btneducationdetails")
	public String btnsubmit(@ModelAttribute("educationdetails") EducationDetailsDomain domain,RedirectAttributes attributes) {
		domain=service.saveEducationDetails(domain);
		Optional<PersionDetailsEntity> getById=service.featchdataById(domain.getPid());
		PersionDetailsEntity entity=getById.get();
		attributes.addFlashAttribute("persiondetails",entity);
		Optional<EducationDetailsEntity> geteductionById=service.getdataById(domain.getEducationid());
		EducationDetailsEntity eduentity=geteductionById.get();
		attributes.addFlashAttribute("educationdetails",eduentity);
		return "redirect:/showform?pid"+domain.getPid();	
	}
}