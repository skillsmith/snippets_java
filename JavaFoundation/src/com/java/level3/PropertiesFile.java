package com.java.level3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		File actualFileInDisk = new File(".\\src\\resources\\config.properties");
		FileInputStream fis = new FileInputStream(actualFileInDisk);
		Properties frameworkConfigSettings = new Properties();
		frameworkConfigSettings.load(fis);

		String jira = null;
		if (frameworkConfigSettings.containsKey("JIRA_Defect_Logging")) {
			jira = frameworkConfigSettings.getProperty("JIRA_Defect_Logging");
		}

		System.out.println("Jira logging turned on?" + jira);
		if (jira.equals("Yes")) {
			System.out.println("Failed scripts will create a defect in JIRA");
		} else {
			System.out.println("Failed scripts will *NOT* create a defect in JIRA");
		}
	}

}
