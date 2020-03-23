package com.somkanya.maven.TDD_Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import com.somkanya.maven.junit1.First2Chars;

class Remove {

	/*		 “ABCD” => “BCD”
             “AACD” => “CD” 
             “BACD” => “BCD”
             “BBAA” => “BBAA”       
             “AABAA” => “BAA”
	*/
	
	First2Chars obj;
	@BeforeEach
	void setUp()
	{
		obj = new First2Chars();
	}
	
	@Test
	void Remove2Char()
	{
		String actual = obj.remove("AABAA");
		assertEquals("BAA",actual);
		
	}
	@Test
	void Remove2ndChar()
	{
		String actual = obj.remove("BACD");
		assertEquals("BCD",actual);
		
	}
	@Test
	void Remove2Chars()
	{
		String actual = obj.remove("AACD");
		assertEquals("CD",actual);
		
	}
	@Test
	void Remove1Char()
	{
		String actual = obj.remove("ABCD");
		assertEquals("BCD",actual);
		
	}

}
