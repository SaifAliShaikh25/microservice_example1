package com.examplemicroservices.user.service.customexception;

public class MyCustomException extends RuntimeException{

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public MyCustomException(String msg) {
		super();
		this.msg = msg;
	}
	
	
}
