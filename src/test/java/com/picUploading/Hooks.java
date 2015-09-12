package com.picUploading;

import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	Scenario scnario;

	BaseMain main;

	@Before
	public void setUp(Scenario result) throws IOException {
		this.scnario = result;
		System.out.println("Running Test " + result.getName());
		main = new BaseMain();
		main.openBrowser();
	}

	@After
	public void tearDown() {
		System.out.println("am in after");
		if (scnario.isFailed()) {
			System.out.println("am in ");

			new Utils().takeScreenShot(scnario.getName());
		}
		main.closeBrowser();

	}
}
