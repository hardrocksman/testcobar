package com.zhl.test.cobar.model;

import java.io.Serializable;

public class UserInfo implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 8096116152901312893L;
	private Integer userId;
	private Integer cobarId;
    private String username;
    private String password;
    private Integer age;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getCobarId() {
		return cobarId;
	}

	public void setCobarId(Integer cobarId) {
		this.cobarId = cobarId;
	}
}