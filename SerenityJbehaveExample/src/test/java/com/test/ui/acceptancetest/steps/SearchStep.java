package com.test.ui.acceptancetest.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.test.ui.pages.SearchPage;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchStep extends ScenarioSteps{

	private static Logger testLogs=LogManager.getLogger(SearchStep.class);
	private SearchPage searchPage;
	
	public SearchStep(final Pages pages) {
		super(pages);
		this.searchPage=getPages().get(SearchPage.class);		
	}
}
