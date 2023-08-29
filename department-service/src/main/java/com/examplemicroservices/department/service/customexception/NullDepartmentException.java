package com.examplemicroservices.department.service.customexception;

public class NullDepartmentException extends RuntimeException{

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public NullDepartmentException(String msg) {
		super();
		this.msg = msg;
	}
	
}
