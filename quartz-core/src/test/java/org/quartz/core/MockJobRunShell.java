package org.quartz.core;

import org.apache.log4j.MDC;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.spi.TriggerFiredBundle;

/**
 * JobRunShell whose thread is tagged with a executionId
 * @author tkashyap
 *
 */
public class MockJobRunShell extends JobRunShell {

	public MockJobRunShell(Scheduler scheduler, TriggerFiredBundle bndle) {
		super(scheduler, bndle);
	}
	
	/** {@inheritDoc} */
	  @Override
	  protected void begin()
	      throws SchedulerException {
	    MDC.put("executionId", "xyz");
	  }

	  /** {@inheritDoc} */
	  @Override
	  protected void complete(boolean argSuccessfulExecution)
	      throws SchedulerException {
	    MDC.remove("messageid");
	  }

}