package com.example.rest.exception;

import java.util.Date;

public class ExceptionResponse {
	
	//date
	//msg
	//details
	
	private Date date;
	private String msg;
	private String details;
	
	public ExceptionResponse(Date date, String msg, String details) {
		super();
		this.date = date;
		this.msg = msg;
		this.details = details;
	}
	
	public Date getDate() {
		return date;
	}
	public String getMsg() {
		return msg;
	}
	public String getDetails() {
		return details;
	}
	
}
