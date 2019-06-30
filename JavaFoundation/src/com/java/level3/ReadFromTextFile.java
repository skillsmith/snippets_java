package com.java.level3;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFromTextFile {

	public static void main(String[] args) throws IOException {
		File simpleTextFile = new File ("D:\\codespace\\JavaFoundation\\src\\resources\\SimpleText.txt");
		FileReader fileReaderObj = new FileReader(simpleTextFile);
		
		BufferedReader betterWay2ReadFiles = new BufferedReader(fileReaderObj);
		
		String lineOfFile;
		while ((lineOfFile=betterWay2ReadFiles.readLine()) != null){
			System.out.println(lineOfFile);
		}
		
	}

}
