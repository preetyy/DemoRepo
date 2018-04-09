package com.qa.test;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DemoTest1
{
	@Test
	public void sum()
	{
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void mul()
	{
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a*b);
	}
	
	@Test
	public void div()
	{
		int a = 10;
		int b = 2;
		Assert.assertEquals(5, a/b);
	}
	
}
