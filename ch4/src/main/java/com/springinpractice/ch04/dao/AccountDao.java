package com.springinpractice.ch04.dao;

import com.springinpractice.ch04.domain.Account;
import com.springinpractice.dao.Dao;

public interface AccountDao extends Dao<Account> {
	
	void create(Account account, String password);
	
	Account findByUsername(String username);
}