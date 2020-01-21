package com.nt.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.nt.domain.PassportDetailsDomain;
import com.nt.service.PersionDetailsService;

@Controller
public class ApplicationReviewController {
	@Autowired
	private PersionDetailsService service;
	
	@RequestMapping(value = "/showform",method = RequestMethod.GET)
	public String savepassortdetails(Model model,HttpServletRequest req) {
		PassportDetailsDomain domain= new PassportDetailsDomain();
		String pid= req.getParameter("pid");
		if(pid!=null && !pid.isEmpty()) {
			int persionId=Integer.parseInt(pid);
			domain.setPid(persionId);
		}
		model.addAttribute("passportdetails", domain);
		return "PassportAppDetails";
	}
@RequestMapping(value = "/passportbtn",method = RequestMethod.POST)
public String btnsubmit(@ModelAttribute("passportdetails") PassportDetailsDomain domain,RedirectAttributes attributes) {
	domain=service.savePassportDetails(domain);
	if(domain!=null) {
		attributes.addFlashAttribute("passportnumber",domain.getPassportnumber());
		attributes.addFlashAttribute("successmesg", "Your Passport Number generate Successfully");	
	}
	else {
		attributes.addFlashAttribute("errormesg","Your Passport Number generate Failed");
	}
	System.out.println(domain);
	return "redirect:/PassportView";	
	}
	@RequestMapping(value = "/PassportView")
	public String passportnumber() {
		return "PassportView";
	}
}