package com.sipleprogram.proteintracker;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TrackingServiceTest {

	private TrackingService service;

	@BeforeClass
	public static void Before() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void After() {
		System.out.println("After Class");
	}

	@Before
	public void setUp() {
		System.out.println("Before");
		service = new TrackingService();
	}

	@After
	public void tearDown() {
		// @After also know as TeaDown - It is useful to clear and rmove
		// fixtures such as databases
		// or any files left behind or setup data left behind
		System.out.println("After");
	}

	@Test
	public void NewTrackingServiceTotalSizeIsZero() {
		assertEquals("Tracking service total was not zero", 0,
				service.getTotal());
	}

	@Test
	public void whenAddingProteinTotalIncreasesByThatAmount() {
		service.addProtein(10);
		assertEquals("Proteing amount was not correct", 10, service.getTotal());

	}

	@Test
	public void whenARemovingProteinTotalRemainsZero() {
		service.removeProtein(5);
		assertEquals(0, service.getTotal());

	}

	@Test(expected = InvalidGoalException.class)
	public void WhenGoalIsLessThanZeroExceptionIsThrown() throws InvalidGoalException {
		service.setGoal(-5);
	}
	
	@Test(timeout = 200)
	public void BadTest() {
		for (int i = 0; i < 10000000; i++) {
			service.addProtein(1);
		}
	}

}
