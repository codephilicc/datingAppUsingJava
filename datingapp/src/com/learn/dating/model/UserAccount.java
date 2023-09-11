package com.learn.dating.model;

import java.util.Objects;

public class UserAccount {

	private int id;
	private String userName;
	private String password;
	private int age;
	private String email;
	private int phoneNumber;
	private String gender;
	private String city;
	private String country;
	private Interest interset;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Interest getInterset() {
		return interset;
	}

	public void setInterset(Interest interset) {
		this.interset = interset;
	}

	@Override
	public String toString() {
		return "UserAccount [id=" + id + ", userName=" + userName + ", password=" + password + ", age=" + age
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", city=" + city
				+ ", country=" + country + ", interset=" + interset + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccount other = (UserAccount) obj;
		return id == other.id;
	}
}
