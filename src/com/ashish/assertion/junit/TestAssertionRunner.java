package com.ashish.assertion.junit;

import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestAssertionRunner {

	final static Logger logger = Logger.getLogger(TestAssertionRunner.class);

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(TestAssertions.class);
		for(Failure failure : result.getFailures()){
			logger.error(failure.toString());
		}
		logger.info("Failure Count : " + result.getFailureCount());
		logger.info(result.wasSuccessful());
	}

}
