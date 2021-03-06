package com.nf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.nf.entity.Account;


public interface AccountDao extends JpaRepository<Account, Integer>
{
	@Transactional
	@Modifying
	@Query("update Account u set u.name=:name where u.id=:id")
	public void modifyAccounts(@Param("name") String name,
			 @Param("id") int id);
	
	@Query("select u from #{#entityName} u where u.id=:id")
	public List<Account> queryCustomer(@Param("id") int id);
}
