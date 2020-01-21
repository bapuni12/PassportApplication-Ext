package com.nt.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.domain.PersionDetailsDomain;
import com.nt.entity.PersionDetailsEntity;
import com.nt.service.PersionDetailsService;
@Controller
public class ViewPersionDetailsController {
	
	@Autowired
	private PersionDetailsService service;
	
	@RequestMapping(value = "/")
	public String persiondisplay(Model model,HttpServletRequest req) {
		PersionDetailsDomain domain= new PersionDetailsDomain();
		String persionid=req.getParameter("pid");
		if(persionid!=null && !persionid.isEmpty()) {
			Integer pid=Integer.parseInt(persionid);
			Optional<PersionDetailsEntity> featchById=service.featchdataById(pid);
			if(featchById.isPresent()) {
				PersionDetailsEntity entity=featchById.get();
				BeanUtils.copyProperties(entity, domain);
			}	
		}	
		model.addAttribute("persiondetails",domain);
		return "PersionDetails_Screen";
	}
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String handlenextbtn(@ModelAttribute( value = "persiondetails") PersionDetailsDomain domain) {
		int pid=service.insertpersiondetails(domain);
		return "redirect:/education?pid=" + pid;

	}

}