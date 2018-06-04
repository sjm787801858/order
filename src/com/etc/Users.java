package com.etc;

public class Users {

	
	private int userId;
	private String userName;
	private String userPwd;
	private String message;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + "]";
	}
	
}
