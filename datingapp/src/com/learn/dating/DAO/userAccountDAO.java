package com.learn.dating.DAO;

import java.util.List;

import com.learn.dating.model.UserAccount;

public interface userAccountDAO {

	void save(UserAccount userAccount);

	UserAccount findbyId(int id);

	List<UserAccount> findAll();

	List<UserAccount> findMatches(int age, String city);
	
	void delete (int id);

}
