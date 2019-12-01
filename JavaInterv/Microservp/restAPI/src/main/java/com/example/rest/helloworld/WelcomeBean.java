package com.example.rest.helloworld;

public class WelcomeBean {

	private String msg;
	
	public WelcomeBean(String msg){
		this.msg = msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
