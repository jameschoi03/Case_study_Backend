package com.jameschoi03.issuetracker.issuetracker.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		this.message=message;
	}

	@Override
	public String toString() {
		return String.format("HelloWordBean [message=%s]", message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

