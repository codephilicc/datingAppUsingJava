
package com.learn.dating.controllers;

import com.learn.dating.DAO.userAccountDAO;
import com.learn.dating.DAO.userAccountDAOImpl;
import com.learn.dating.model.Interest;
import com.learn.dating.model.UserAccount;

public class userAccountController {

	public static void main(String[] args) {
		userAccountController userAccountController = new userAccountController();
		userAccountController.findMatchingUsers();

	}

	public void registerUser() {
		userAccountDAO dao = new userAccountDAOImpl();
		UserAccount userAccount = new UserAccount();
		userAccount.setId(1);
		userAccount.setAge(30);
		userAccount.setCity("Delhi");
		userAccount.setCountry("India");
		userAccount.setEmail("abc@d.com");
		userAccount.setGender("M");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber(123456789);
		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("watching movies");
		interest.setHobbies("playing chess");
		userAccount.setInterset(interest);
		dao.save(userAccount);
		System.out.println(dao.findbyId(1));

	}

	public void findAll() {
		userAccountDAO dao = new userAccountDAOImpl();
		createUsers(dao);

		dao.delete(1);
		System.out.println(dao.findAll());

	}

	public void findMatchingUsers() {
		userAccountDAO dao = new userAccountDAOImpl();
		createUsers(dao);

		System.out.println(dao.findMatches(30,"Delhi"));

	}

	private void createUsers(userAccountDAO dao) {
		UserAccount userAccount = new UserAccount();
		userAccount.setId(1);
		userAccount.setUserName("John");
		userAccount.setAge(30);
		userAccount.setCity("Delhi");
		userAccount.setCountry("India");
		userAccount.setEmail("abc@d.com");
		userAccount.setGender("M");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber(123456789);
		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("watching movies");
		interest.setHobbies("playing chess");
		userAccount.setInterset(interest);
		dao.save(userAccount);

		UserAccount userAccount2 = new UserAccount();
		userAccount2.setId(2);
		userAccount.setUserName("Bob");
		userAccount2.setAge(30);
		userAccount2.setCity("Patna");
		userAccount2.setCountry("India");
		userAccount2.setEmail("abc@d.com");
		userAccount2.setGender("M");
		userAccount2.setPassword("password");
		userAccount2.setPhoneNumber(123456789);
		dao.save(userAccount2);
	}

}
