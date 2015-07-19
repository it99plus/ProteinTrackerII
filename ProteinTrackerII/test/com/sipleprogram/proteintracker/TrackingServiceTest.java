package com.sipleprogram.proteintracker;

import static org.junit.Assert.*;
import org.junit.Test;

public class TrackingServiceTest {

	@Test
	public void NewTrackingServiceTotalSizeIsZero() {
		TrackingService service = new TrackingService();
		assertEquals("Tracking service total was not zero", 1,service.getTotal());
	}

}
