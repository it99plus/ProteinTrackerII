package com.sipleprogram.proteintracker;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TrackingServiceTest {

	private TrackingService service; 
	
	@Before
	public void setUp() {
		System.out.println("Before");
		service = new TrackingService();
	}

	@Test
	public void NewTrackingServiceTotalSizeIsZero() {
		assertEquals("Tracking service total was not zero", 0,service.getTotal());
	}
	
	@Test
	public void whenAddingProteinTotalIncreasesByThatAmount() {
		service.addProtein(10);
		assertEquals("Proteing amount was not correct", 10,service.getTotal());
		
	}
	
	@Test
	public void whenARemovingProteinTotalRemainsZero() {
		service.removeProtein(5);
		assertEquals(0,service.getTotal());
		
	}

}
