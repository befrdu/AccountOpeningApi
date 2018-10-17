package citi.fintech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import citi.fintech.dao.AccountOpeningDao;
import citi.fintech.model.AccountType;

@Service
public class AccountOpeningService {
	@Autowired
	private AccountOpeningDao accountOpeningDao;
	
	public List<AccountType> getAccountTypeList(){
		return accountOpeningDao.getAccountTypeList();
	}
}
