package pack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MassiveTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("BeforeGroups");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("AfterGroups");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

	@Test
	public void arrayFillTest() {
		Massive massive = new Massive();
		int[] actual_result = massive.arrayFill();
		int[] expected_result = { 0, 1, 2, 3, 4, 5 };
		Assert.assertEquals(actual_result, expected_result);
	}

	@Test
	public void arrayFillTestNotNull() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive.arrayFill(), "Null");
	}

	@Test(timeOut = 3000)
	public void addToTheArrayNumberOneTest() {
		Massive massive = new Massive();
		int[] actual_result = massive.addToTheArrayNumberOne();
		int[] expected_result = { 3, 3, 2, 4, 6, 6 };
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test
	public void addToTheArrayNumberOneTestNotNull() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive.addToTheArrayNumberOne(), "Null");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void arrayElementDividedByIndexTest() {
		Massive massive = new Massive();
		int[] actual_result = massive.arrayElementDividedByIndex();
		int[] expected_result = { 0, 3, 1, 1, 1, 1 };
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void arrayElementDividedByIndexTestNotNull() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive.arrayElementDividedByIndex(), "Null");
	}
	
	@Test
	public void arrayMultipliedBy3Test() {
		Massive massive = new Massive();
		int[] actual_result = massive.arrayMultipliedBy3();
		int[] expected_result = { 6, 9, 3, 12, 15, 18 };
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test
	public void arrayMultipliedBy3TestNotNull() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive.arrayMultipliedBy3(), "Null");
	}
	
	@Test(enabled = false)
	public void arrayMultipliedBy3TestNotEquals() {
		Massive massive = new Massive();
		int[] actual_result = massive.arrayMultipliedBy3();
		int[] expected_result = { 6, 9, 3, 12, 15, 19 };
		Assert.assertNotEquals(actual_result, expected_result);
	}

	@Test
	public void getSumOfElementsTest() {
		Massive massive = new Massive();
		int actual_result = massive.getSumOfElements();
		int expected_result = 21;
		Assert.assertEquals(actual_result, expected_result);
	}

	@Test
	public void getSumOfElementsTestTrue() {
		Massive massive = new Massive();
		Assert.assertTrue(massive.getSumOfElements() == 21, "Error!");
	}

	@Test
	public void getSumOfElementsTestFalse() {
		Massive massive = new Massive();
		Assert.assertFalse(massive.getSumOfElements() != 21, "Ok!");
	}

	@Test
	public void getSumOfElementsTestNotNull() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive.getSumOfElements(), "Null!");
	}

	@Test
	public void multiplyAllTheNumbersInTheArrayTest() {
		Massive massive = new Massive();
		int actual_result = massive.multiplyAllTheNumbersInTheArray();
		int expected_result = 720;
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test
	public void multiplyAllTheNumbersInTheArrayTestTrue() {
		Massive massive = new Massive();
		Assert.assertTrue(massive.multiplyAllTheNumbersInTheArray() == 720, "Error!");
	}
	
	@Test
	public void multiplyAllTheNumbersInTheArrayTestFalse() {
		Massive massive = new Massive();
		Assert.assertFalse(massive.multiplyAllTheNumbersInTheArray() != 720, "Ok!");
	}

	@Test
	public void multiplyAllTheNumbersInTheArrayTestNotNull() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive.multiplyAllTheNumbersInTheArray(), "Null!");
	}
	
	@Test
	public void reversArrayTest() {
		Massive massive = new Massive();
		int[] actual_result = massive.reversArray();
		int[] expected_result = { 6, 5, 4, 1, 3, 2 };
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test
	public void reversArrayTestNotNull() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive.reversArray(), "Null!");
	}

	@Test
	public void sortTheArrayInAscendingOrderTest() {
		Massive massive = new Massive();
		int[] actual_result = massive.sortTheArrayInAscendingOrder();
		int[] expected_result = { 1, 2, 3, 4, 5, 6 };
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test
	public void sortTheArrayInAscendingOrderTestNotNull() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive.sortTheArrayInAscendingOrder(), "Null!");
	}

	@Test
	public void clearArrayTest() {
		Massive massive = new Massive();
		Assert.assertNull(massive.clearArray(), "Not null");
	}

	@Test
	public void getSummMinAndMaxElementsTest() {
		Massive massive = new Massive();
		int actual_result = massive.getSumMinAndMaxElements();
		int expected_result = 7;
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test
	public void getSumMinAndMaxElementsTestTrue() {
		Massive massive = new Massive();
		Assert.assertTrue(massive.getSumMinAndMaxElements() == 7, "Error!");
	}
	
	@Test
	public void getSumMinAndMaxElementsTestFalse() {
		Massive massive = new Massive();
		Assert.assertFalse(massive.getSumMinAndMaxElements() != 7, "OK!");
	}
}
