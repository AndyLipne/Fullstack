package com.nt.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.nt.App;
import com.nt.service.Arthemetic;


public class AppTest 
{
	@Test
    public void testWithPositives()
    {
    	Arthemetic a = new Arthemetic();
    	int expected = 30;
    	int actual = a.sum(20,10);
    	assertEquals(actual,expected);
    }
	
	@Test
    public void testWithNegetives()
    {
    	Arthemetic a = new Arthemetic();
    	int expected = -30;
    	int actual = a.sum(-20,-10);
    	assertEquals(actual,expected);
    }
	
	@Test
    public void testWithZeros()
    {
    	Arthemetic a = new Arthemetic();
    	int expected = 0;
    	int actual = a.sum(0,0);
    	assertEquals(actual,expected);
    }
}
