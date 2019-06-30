package com.java.level3;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteIntoTextFile {

	public static void main(String[] args) throws IOException {
		File simpleTextFile = new File("D:\\codespace\\JavaFoundation\\src\\resources\\Names.txt");
		FileWriter fileWriterObj = new FileWriter(simpleTextFile);
		BufferedWriter betterWay2WriteFiles = new BufferedWriter(fileWriterObj);
		BufferedReader betterWay2Read = new BufferedReader(new InputStreamReader(System.in));
		String consoleInput;

		System.out.println("Enter full name:");
		consoleInput = betterWay2Read.readLine();
		while (!consoleInput.equalsIgnoreCase("quit")) {
			betterWay2WriteFiles.write(consoleInput);
			betterWay2WriteFiles.newLine();
			System.out.println("Enter another full name:");
			consoleInput = betterWay2Read.readLine();
		}
		betterWay2WriteFiles.close();
	}
}