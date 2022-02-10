package com.testing;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void beforetest()
	{
	System.out.println("open the driver");	
	}
	
	@After
	public void aftertest()
	{
	System.out.println("close the driver");	
	
	}

}
