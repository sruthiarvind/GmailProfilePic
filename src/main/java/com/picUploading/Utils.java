package com.picUploading;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utils extends BaseMain {
	public boolean getCurrentURL() {
		return !driver.getCurrentUrl().isEmpty();
	}

	public void takeScreenShot(String scenarioName) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			System.out.println("fdhkjsdlsdkl    " + System.getProperty("user.dir") + "/screenshot/" + scenarioName);
			FileUtils.copyFile(scrFile,
					new File(System.getProperty("user.dir") + "/screenshot/" + scenarioName + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
