package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		
		while (true) {
				
			File inputFile = getFileFromUser();	
			Scanner in = new Scanner(System.in);
			
			System.out.println("What is the search word you are looking for?");
			String searchFor = in.nextLine();
			
			System.out.println("Should the search be case sensitive? (Y/N)");
			String caseSensitive = in.nextLine();
			
			int lineNumber = 0;
			
			if (caseSensitive.equals("Y")) {
				
				try (Scanner fileIn = new Scanner(inputFile)) {
					
					while (fileIn.hasNextLine()) {
						lineNumber++;
						String line = fileIn.nextLine();
						if (line.contains(searchFor)) {
							System.out.println(lineNumber + ") " + line);
						}
					}
				} 
			}
			
			if (caseSensitive.equals("N")) {
				
				try (Scanner fileIn = new Scanner(inputFile)) {
					
					while (fileIn.hasNextLine()) {
						lineNumber++;
						String line = fileIn.nextLine();
						boolean caseSensitiveCheck = line.toLowerCase().contains(searchFor.toLowerCase());
						if (caseSensitiveCheck == true) {
							System.out.println(lineNumber + ") " + line);
						}
					}
				} 
			}
		}	
	}

	private static File getFileFromUser() {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the file that should be searched?");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}
	
}