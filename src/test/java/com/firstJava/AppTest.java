package com.firstJava;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {

	@Test
	public void test() {
		MyExample ex = new MyExample();
		Assert.assertEquals(ex.getval(), "Sample Code");
	}
	@Test
	public void test2() {
		MyExample ex = new MyExample();
		Assert.assertEquals(ex.getResult(), "1st test successful");
	}

}
