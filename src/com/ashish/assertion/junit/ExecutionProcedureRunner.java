package com.ashish.assertion.junit;

import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecutionProcedureRunner {

	final static Logger logger = Logger.getLogger(ExecutionProcedureRunner.class);
	
	public static void main(String[] args) {
		
		 Result result = JUnitCore.runClasses(ExecutionProcedureJunit.class);
	      for (Failure failure : result.getFailures()) {
	         logger.error(failure.toString());
	         System.out.println(failure.toString());
	      }
	      logger.info(result.wasSuccessful());
	         System.out.println(result.wasSuccessful());
	}

}
