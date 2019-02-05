package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		
		String[] userInputtedDecimals;
		
		String userInputDecimals = in.nextLine();
		
		userInputtedDecimals = userInputDecimals.split("||");

	}
	
	private static File getFileFromUser() {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Where is the quiz file?");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if(inputFile.exists() == false) {
			System.out.println(path+" does not exist");
			System.exit(1);
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1);
		}
		return inputFile;
	}
	
}