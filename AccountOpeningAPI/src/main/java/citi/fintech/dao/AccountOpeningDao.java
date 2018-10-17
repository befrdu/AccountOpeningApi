package citi.fintech.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import citi.fintech.model.AccountType;

@Repository
public class AccountOpeningDao {
public List<AccountType> getAccountTypeList(){
	return getAllAccountType();
}
public static List<AccountType> getAllAccountType(){
	List<AccountType>accoutTypes=new ArrayList<AccountType>();
	AccountType acctT1=new AccountType("Banking", 1);
	AccountType acctT2=new AccountType("Card", 2);
	AccountType acctT3 =new AccountType("Brokerage", 3);
	AccountType acctT4=new AccountType("Mortgage", 4);
	
	accoutTypes.add(acctT1);
	accoutTypes.add(acctT2);
	accoutTypes.add(acctT3);
	accoutTypes.add(acctT4);
	return accoutTypes;
	
}
}
