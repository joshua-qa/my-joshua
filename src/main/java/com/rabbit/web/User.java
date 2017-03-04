package com.rabbit.web;

public class User {
	private String empId;
	private String password;
	private String userName;

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [empId=" + empId + ", password=" + password + ", userName=" + userName + "]";
	}
}
