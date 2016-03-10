package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Account_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	@Test
	public void testAccountDeposit() {
		Account instance = new Account(1122, 20000);
		instance.setAnnualInterestRate(4.5);
		double expectedresult = 23000;
		double actualResult = instance.deposit(3000);
		assertEquals("testAccountwithdraw() failed", expectedresult,actualResult, .5);
		System.out.println("Balance: " + instance.getBalance());
		System.out.println("Monthly Interest Rate: " + instance.getMonthlyInterestRate());
		System.out.println("DateCreated: " + instance.getDateCreated());
	}
	@Test
	public void testAccountWithdraw() throws InsufficientFundsException {
		Account instance = new Account(1122, 20000);
		instance.setAnnualInterestRate(4.5);
		double expectedresult = 17500;
		double actualResult = instance.withdraw(2500);
		assertEquals("testAccountwithdraw() failed", expectedresult,actualResult, .5);
		System.out.println("Balance: " + instance.getBalance());
		System.out.println("Monthly Interest Rate: " + instance.getMonthlyInterestRate());
		System.out.println("DateCreated: " + instance.getDateCreated());
	}
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		Account instance = new Account(1122, 20000);
        instance.withdraw(21000);
	}
}
