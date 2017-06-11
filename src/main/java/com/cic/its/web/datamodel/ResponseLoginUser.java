package com.cic.its.web.datamodel;

public class ResponseLoginUser {

	private Boolean success;
	private LoginUser user;
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public LoginUser getUser() {
		return user;
	}
	public void setUser(LoginUser user) {
		this.user = user;
	}
	
	
}
