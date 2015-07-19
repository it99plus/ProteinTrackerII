package com.sipleprogram.proteintracker;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;


@RunWith(Theories.class) 	
public class TrackingServiceTheories {
	
	@DataPoint
	public static int[] data() {
		return new int[] {1, 5, 10, 15, 20, 50, 4};
	}
	
	@Theory
	public void positiveValuesShouldAlwaysHavePositiveTotals(int intValue) {
		TrackingService service = new TrackingService();
		service.addProtein(intValue);
		assertTrue(service.getTotal() > 0);
	}

	
}
