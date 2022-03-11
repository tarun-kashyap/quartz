package org.quartz.impl;

import org.junit.Assert;
import org.junit.Test;
import org.quartz.Scheduler;

/**
 * TestCase to verify StdSchedulerFactory initializes correctly a custom JobRunShellFactory.
 * 
 * @author tkashyap
 *
 */
public class StdScheduleFactoryCustomJobRunShellFactoryTest {
	
	@Test
	public void loadAndInitializeCustomJobShellFactoryTest() throws Exception {
	    StdSchedulerFactory factory = new StdSchedulerFactory("org/quartz/properties/quartzCustomJobRunShellFactory.properties");
        Scheduler scheduler = factory.getScheduler();
	    scheduler.start();
	    Assert.assertTrue("Scheduler could not be started with Custom JobRunShellFactory",scheduler.isStarted());
	    scheduler.shutdown();
	}

}