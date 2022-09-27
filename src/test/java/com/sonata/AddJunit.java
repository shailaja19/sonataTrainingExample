package com.sonata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddJunit {

	@Test
	void test() {
		AddImpl p1 = new AddImpl();
		assertEquals(30, p1.add(10, 20));
	}
}
