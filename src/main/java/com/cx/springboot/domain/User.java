package com.cx.springboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "czregister")
public class User {
	@Id
	@GeneratedValue
	private long id;// 主键.
	private String usersName;
	private String usersPass;
	private String usersPoints;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public String getUsersPass() {
		return usersPass;
	}

	public void setUsersPass(String usersPass) {
		this.usersPass = usersPass;
	}

	public String getUsersPoints() {
		return usersPoints;
	}

	public void setUsersPoints(String usersPoints) {
		this.usersPoints = usersPoints;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}