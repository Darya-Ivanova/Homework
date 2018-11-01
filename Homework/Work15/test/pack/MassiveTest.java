package pack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MassiveTest {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("BeforeClass");
	}
	
	@Ignore
	@Test
	public void arrayFill_test() {
		Massive massive = new Massive();
		int [] actual_result = massive.arrayFill();
		int [] expected_result = {0, 1, 2, 3, 4, 5};
		assertArrayEquals("arrayFill isn`t correct!", expected_result, actual_result);
	}
	
	@Before
	public void before(){
		System.out.println("Before");
	}
	
	@Test(timeout = 1000)
	public void addToTheArrayNumberOne_test() {
		Massive massive = new Massive();
		int [] actual_result = massive.addToTheArrayNumberOne();
		int [] expected_result = {2, 2, 4, 4, 6, 6};
		assertArrayEquals("addToTheArrayNumberOne isn`t correct!", expected_result, actual_result);
	}
	
	@After
	public void after(){
		System.out.println("After");
	}
	
	@Test(expected = ArithmeticException.class)
	public void arrayElementDividedByIndex_test() {
		Massive massive = new Massive();
		int [] actual_result = massive.arrayElementDividedByIndex();
		int [] expected_result = {0, 2, 2, 1, 1, 1};
		assertArrayEquals("arrayElementDividedByIndex isn`t correct!", expected_result, actual_result);
	}
	
	@Ignore
	@Test
	public void arrayMultipliedBy3_test() {
		Massive massive = new Massive();
		int [] actual_result = massive.arrayMultipliedBy3();
		int [] expected_result = {3, 6, 9, 12, 15, 18};
		assertArrayEquals("arrayMultipliedBy3 isn`t correct!", expected_result, actual_result);
	}
	
	@Test
	public void getSumOfElements_test() {
		Massive massive = new Massive();
		int actual_result = massive.getSumOfElements();
		int expected_result = 21;
		assertEquals("getSumOfElements isn`t correct!", expected_result, actual_result);
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("AfterClass");
	}
}
