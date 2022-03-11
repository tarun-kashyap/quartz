package org.quartz.core;

import org.quartz.Scheduler;
import org.quartz.SchedulerConfigException;
import org.quartz.SchedulerException;
import org.quartz.spi.TriggerFiredBundle;

/**
 * @author tkashyap
 *
 */
public class MockJobRunShellFactory implements JobRunShellFactory {
	
    private Scheduler scheduler;

    @Override
    public void initialize(Scheduler scheduler) throws SchedulerConfigException {
	   this.scheduler = scheduler;		
	}

	@Override
	public JobRunShell createJobRunShell(TriggerFiredBundle bundle) throws SchedulerException {
       return new JobRunShell(scheduler, bundle);
	}

}