package com.rabbit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false, length=20)
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
