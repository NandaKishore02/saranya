package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Task1 extends baseclass{
	
	@BeforeClass
	public static void browser() {
		launchBrowser();

	}
	@Before
	public void startTime() {
		Date D=new Date();
		System.out.println(D);
		
	}
	@Test
	public void tc0() {
		System.out.println("nanda");

	}
	
	@After
	public void endTime() {
	 Date d=new Date();
	 System.out.println(d);
	}
	@AfterClass
	public static void closeWeb() {
		driver.quit();

	}

}
