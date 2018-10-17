package citi.fintech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import citi.fintech.model.AccountType;
import citi.fintech.model.Applicant;
import citi.fintech.service.AccountOpeningService;

@RestController
public class AccountOpeningController {
	@Autowired
	private AccountOpeningService accountService;
	
	@RequestMapping(value="/getAccountType", method=RequestMethod.GET)
	public List<AccountType> getAccountType(){
		
		return accountService.getAccountTypeList();
		
	}
	@RequestMapping(value="/")
	public String test(){
		return "Service is reacheable";
	}
	@RequestMapping(value="/accountOpeningApplication", method=RequestMethod.GET)
	public String getAccountOpeningFrom(@RequestBody Applicant applicant){
		
		return "";
	}

}
