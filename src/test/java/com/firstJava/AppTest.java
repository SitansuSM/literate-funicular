package com.firstJava;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {

	@Test
	public void test() {
		MyExample ex = new MyExample();
		Assert.assertEquals(ex.getval(), "Sample Code");
		//fail("Not yet implemented");
	}

}
