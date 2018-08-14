package com.ssh.dmain;

import java.io.Serializable;
//登录信息
public class Login implements Serializable {
	//登录id
	private Long lId;
	//登录名
	private String lUsername;
	//登录信息
	private String lPassword;
	public Long getlId() {
		return lId;
	}
	public void setlId(Long lId) {
		this.lId = lId;
	}
	public String getlUsername() {
		return lUsername;
	}
	public void setlUsername(String lUsername) {
		this.lUsername = lUsername;
	}
	public String getlPassword() {
		return lPassword;
	}
	public void setlPassword(String lPassword) {
		this.lPassword = lPassword;
	}
	@Override
	public String toString() {
		return "Login [lId=" + lId + ", lUsername=" + lUsername + ", lPassword=" + lPassword + "]";
	}
	
	
	
	

	
	
	
	
}
