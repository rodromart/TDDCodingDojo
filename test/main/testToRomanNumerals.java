package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testToRomanNumerals {
	
	RomanNumerals r;
	@Before
	public void tearUp(){
		 r = new RomanNumerals();

	}
	
	@Test
	public void testWithArgumentsEqualsToOne() {
		assertEquals("I", r.toRomanNumerals(1));
	}
	@Test
	public void testWithArgumentsEqualsToTwo() {
		assertEquals("II", r.toRomanNumerals(2));
	}
	@Test
	public void testWithArgumentsEqualsToThree() {
		assertEquals("III", r.toRomanNumerals(3));
	}
	@Test
	public void testWithArgumentsEqualsToFour() {
		assertEquals("IV", r.toRomanNumerals(4));
	}
	@Test
	public void testWithArgumentsMayorToFive(){
		assertEquals("VI", r.toRomanNumerals(6));
	}
	@Test
	public void testWithArgumentsEqualsToNine(){
		assertEquals("IX", r.toRomanNumerals(9));
	}
	@Test
	public void testWithArgumentsEqualsToTen(){
		assertEquals("X", r.toRomanNumerals(10));
	}
	@Test
	public void testWithArgumentsEqualsToEleven(){
		assertEquals("XI", r.toRomanNumerals(11));
	}
	@Test
	public void testWithArgumentsEqualsToTwelve(){
		assertEquals("XII", r.toRomanNumerals(12));
	}


}
