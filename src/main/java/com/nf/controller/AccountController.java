package com.nf.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nf.dao.AccountDao;
import com.nf.entity.Account;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	  @Autowired
	  AccountDao accountDao;
	 
	  @RequestMapping(value = "/list", method = RequestMethod.GET)
	  public String getAccounts() 
	  {
	    return accountDao.queryCustomer(3).toString();

	  }
	  
	  @RequestMapping(value = "/save", method = RequestMethod.POST)
	  public String saveAccounts() 
	  {
		    Account a = new Account("sa",2460);
		    accountDao.save(a);
		    
		    return "success";
	  }
	  
	  @RequestMapping(value = "/modify", method = RequestMethod.GET)
	  public String modifyAccounts(Account a) 
	  {
		    a = new Account("saaaaaaaaa",2460);
		    a.setId(3);
		    accountDao.modifyAccounts(a.getName(), a.getId());
		    return "success";
	  }
	  
	  @RequestMapping(value = "/delete", method = RequestMethod.GET)
	  public String deleteAccounts(int id) 
	  {
		    accountDao.delete(id);
		    return "success";
	  }
}
