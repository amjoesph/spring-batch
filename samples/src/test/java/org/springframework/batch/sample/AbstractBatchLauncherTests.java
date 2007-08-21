/*
 * Copyright 2006-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.batch.sample;

import org.springframework.batch.core.configuration.JobConfiguration;
import org.springframework.batch.execution.bootstrap.SynchronousJobLauncher;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 * @author Dave Syer
 *
 */
public abstract class AbstractBatchLauncherTests extends AbstractDependencyInjectionSpringContextTests {

	protected SynchronousJobLauncher launcher;
	private JobConfiguration jobConfiguration;

	/**
	 * Subclasses can provide name of job to run. We guess it by looking at the
	 * unique job configuration name.
	 */
	protected String getJobName() {
		return jobConfiguration.getName();
	}

	public void setBatchContainerLauncher(SynchronousJobLauncher launcher) {
		this.launcher = launcher;
	}
	
	/**
	 * @param jobConfiguration the jobConfiguration to set
	 */
	public void setJobConfiguration(JobConfiguration jobConfiguration) {
		this.jobConfiguration = jobConfiguration;
	}

}
