package com.test.ui.acceptancetest.steps;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import net.serenitybdd.jbehave.SerenityStories;


public class AcceptanceTestSuite extends SerenityStories{
	private static Logger testLogs=LogManager.getLogger(AcceptanceTestSuite.class);
	
	public AcceptanceTestSuite() {
		findStoriesCalled("GoogleSearch.story");
		AcceptanceTestSuite.testLogs.log(Level.INFO, getClass().getPackage().getName()+"Initialized");
	}

}
