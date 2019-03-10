package com.lx.gamecenter.entity.user;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String userName;

	private String password;

	private String nickname;

	private String registerTime;

	private String lastLoginTime;

	private String lastRequestUrl;

	private String adminFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastRequestUrl() {
		return lastRequestUrl;
	}

	public void setLastRequestUrl(String lastRequestUrl) {
		this.lastRequestUrl = lastRequestUrl;
	}

	public String getAdminFlag() {
		return adminFlag;
	}

	public void setAdminFlag(String adminFlag) {
		this.adminFlag = adminFlag;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", nickname=" + nickname + ", registerTime=" + registerTime + ", lastLoginTime=" + lastLoginTime + ", lastRequestUrl=" + lastRequestUrl + ", adminFlag=" + adminFlag + "]";
	}

}
