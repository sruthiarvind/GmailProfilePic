package com.picUploading;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", dryRun = false, tags = "@wip")

public class RunnerTest {

	@BeforeClass
	public static void clean() {
		new CleanDirectory();

	}

}
