package com.sipleprogram.proteintracker;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

public class TrackingServiceTest {

	private TrackingService service;
	private int Integer;

	@BeforeClass
	public static void Before() {
		//System.out.println("Before Class");
	}

	@AfterClass
	public static void After() {
		//System.out.println("After Class");
	}

	@Before
	public void setUp() {
		// System.out.println("Before");
		service = new TrackingService();
	}

	@After
	public void tearDown() {
		// @After also know as TeaDown - It is useful to clear and rmove
		// fixtures such as databases
		// or any files left behind or setup data left behind
		//System.out.println("After");
	}

	@Test
	@Category(BadTestCategory.class)
	public void NewTrackingServiceTotalSizeIsZero() {
		assertEquals("Tracking service total was not zero", 0,service.getTotal());
	}

	@Test
	@Category(GoodTestCategory.class)
	public void whenAddingProteinTotalIncreasesByThatAmount() {
		service.addProtein(10);
		// assertEquals("Proteing amount was not correct", 10, service.getTotal());
		// assertThat(service.getTotal(),is(10));
		assertThat(service.getTotal(), allOf(is(10), instanceOf(Integer.class)));
		// all of this conditions: it is 10 and it instaceof Integer.class.
	}

	@Test
	public void whenARemovingProteinTotalRemainsZero() {
		service.removeProtein(5);
		// assertEquals(0, service.getTotal());
		assertThat(service.getTotal(),is(0));
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	//@Test(expected = InvalidGoalException.class)
	@Test
	public void WhenGoalIsLessThanZeroExceptionIsThrown() throws InvalidGoalException {
		thrown.expect(InvalidGoalException.class);
//		thrown.expectMessage("Goal was less than zero!");
		thrown.expectMessage(containsString("Goal"));
		service.setGoal(-5);
	}
	
	@Test(timeout = 200)
	@Ignore
	public void BadTest() {
		for (int i = 0; i < 10000000; i++) {
			service.addProtein(1);
		}
	}

}
