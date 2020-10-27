package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.example.Bank;
import com.training.example.ExceedingException;
import com.training.example.NegativeValueException;

class BankTest {
	Bank bank;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Init");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Destroy");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before test");
		bank = new Bank(8000.0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After test");
		bank = null;
		
	}

	

	@Test
	@DisplayName(value = "Deposit Error")
	void testDeposit() throws ExceedingException {
		double balance = bank.deposit(2000.0);
		assertEquals(10000,balance,"should be 10000");
	}
	
	@Test
	void testDepositNeg() {
		assertThrows(NegativeValueException.class,()->bank.deposit(-900.0));
	}

	@Test
	void testDepositExceeding() {
		
		assertThrows(ExceedingException.class,()->bank.deposit(4100.0));
	}
	
	
	
	@Test
	void testWithdraw() throws ExceedingException {
		double balance = bank.withdraw(2000.0);
		assertEquals(6000,balance,"should be 6000");
	}
	
	@Test
	void testWithdrawExceeding() {
		
		assertThrows(ExceedingException.class,()->bank.withdraw(4100.0));
	}
	
	@Test
	void testWithdrawNeg() {
		
		assertThrows(NegativeValueException.class,()->bank.withdraw(-900.0));
	}
	
	
	@Test
	void testWithdrawEq() {
		
		assertThrows(ExceedingException.class,()->bank.withdraw(8000.0));
	}
	
	@Test
	void testAverage() throws ExceedingException {
		double average = bank.Average(3,6,9);
		assertEquals(6,average,"should be 6");
	}
	
	@Test
	void testAverageNeg() {
		assertThrows(NegativeValueException.class,()->bank.Average(-3,-6,-9));
	}
	
	@Test
	void testAverageExceeding() {
		assertThrows(ExceedingException.class,()->bank.Average(300,600,900));
	}
	
	

}
