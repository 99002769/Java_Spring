package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.example.Calculator;

class CalculatorTest {
	
	Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all testcases");
	}
	
	
	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		
		System.out.println("Before each testcases");
	}
	

	@AfterEach
	void tearDown() throws Exception {
		calculator = new Calculator();
		System.out.println("After each testcases");
	}

	@Test
	void testSum() {
		
		int actual = calculator.sum(10,20);
		assertEquals(30,actual);
	}
	@Test
	void testSumNeg() {
		
		int actual = calculator.sum(-10,-20);
		assertEquals(-30,actual);
	}
	@Test
	void testDifference() {
		
		int actual = calculator.difference(20,10);
		assertEquals(10,actual);
	}
	@Test
	void testDifferenceNeg() {
		
		int actual = calculator.difference(-20,-10);
		assertEquals(-10,actual);
	}
	
	@Test
	void testDivision() {
		
		int actual = calculator.division(20,5);
		assertEquals(4,actual);
	}
	/*@Test
	void testDivisionNeg() {
		
		int actual = calculator.division(-20,-5);
		assertEquals(-4,actual);
	}*/

}
