package com.learn.dating.model;

public class Interest {

	private int id;
	private String likes;
	private String disLikes;
	private String hobbies;
	private String profileUrl;

	private String about;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public String getDisLikes() {
		return disLikes;
	}

	public void setDisLikes(String disLikes) {
		this.disLikes = disLikes;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	@Override
	public String toString() {
		return "Interest [id=" + id + ", likes=" + likes + ", disLikes=" + disLikes + ", hobbies=" + hobbies
				+ ", profileUrl=" + profileUrl + ", about=" + about + "]";
	}
	
}
