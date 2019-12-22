package com.automation.labs;

import org.junit.jupiter.api.Test;

public class TestBasic {

	@Test
	public void testNumber1() {
		// given
		String message = "Hello to automation class";
		Greetings greetings = new Greetings();

		// when
		// String result = greetings.sayHello();

		// then
		// assertEquals(message, result);
	}

	@Test
	public void testNumber2() {
		// given
		String name = "Juan";
		String message = "Hello to automation class Juan";
		// Greetings greetings = new Greetings(name);

		// when
		// String result = greetings.sayHello();

		// then
//		assertEquals(message, result);
	}
}
