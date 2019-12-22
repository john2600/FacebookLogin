package com.automation.labs;

public class Greetings {
	private String name;

	public Greetings() {
	}

	public Greetings(String name) {
		this.name = name;
	}

	public String sayHello() {
		String message = "Hello to automation class";
		if (name != null && !name.isEmpty()) {
			message = message + " " + name;
		}
		return message;
	}
}
