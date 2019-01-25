package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order 
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"] 
	 */
	
	public List<String> array2List(String[] stringArray) {
		
		List<String> array2List = new ArrayList<String>();
		for (String fruits : stringArray) {
			array2List.add(fruits);
		}
	return array2List;
	}
	
	/*
	 Given a list of Strings, return an array containing the same Strings in the same order 
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	
	public String[] list2Array(List<String> stringList) {
		
		String[] list2Array = stringList.toArray(new String[stringList.size()]);
		for (String fruitOrColor : list2Array) {
			return list2Array;
		}
		return null;
	}
	
	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order 
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	
	public List<String> no4LetterWords(String[] stringArray) {
		
		List<String> no4LetterWords = new ArrayList<String>();
			for (String nextWord : stringArray) {
				if (nextWord.length() != 4) {
					no4LetterWords.add(nextWord);
				}
			}
		return no4LetterWords;
	}

	/*
	 Given a List of Strings, return a new list in reverse order of the original. One obvious solution is to
	 simply loop through the original list in reverse order, but see if you can come up with an alternative
	 solution. (Hint: Think LIFO (i.e. stack))
	 reverseList( ["purple", "green", "blue", "yellow", "green" ])  -> ["green", "yellow", "blue", "green", "purple" ]
	 reverseList( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"} )
		-> ["way", "the", "all", "jingle", "bells", "jingle", "bells", "jingle"]
	 */
	
	public List<String> reverseList(List<String> stringList) {
		
		Stack<String> forwardsStack = new Stack<String>();
		List<String> backwardsList = new ArrayList<String>();
		
		for (int i = 0; i < stringList.size(); i++) {
			forwardsStack.push(stringList.get(i));
		}
		while (forwardsStack.isEmpty() == false) {
			backwardsList.add(forwardsStack.pop());
		}
		return backwardsList;
	}

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	
	public List<Double> arrayInt2ListDouble(int[] intArray) {
		
		List<Double> arrayInt2ListDouble = new ArrayList<Double>();
		for (double number : intArray) {
			number = number / 2;
			arrayInt2ListDouble.add(number);
		}
	return arrayInt2ListDouble;
	}
	
	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
	 */
	
	public Integer findLargest(List<Integer> integerList) {
		
		int maxInteger = integerList.get(0);
		for (int i = 0; i < integerList.size(); i++) {
			if (integerList.get(i) > maxInteger) {
				maxInteger = integerList.get(i);
			}
		}
		return maxInteger;
	}
	
	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]  
	 */
	
	public List<Integer> oddOnly(Integer[] integerArray) {
		
		List<Integer> oddOnly = new ArrayList<Integer>();
		for (Integer nextInteger : integerArray) {
			if (nextInteger % 2 == 1) {
				oddOnly.add(nextInteger);
			}
		}
		return oddOnly;
	}
	
	/* 
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in 
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
	 */
	
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
		
		int matchCount = 0;
		for (int everyInteger : integerList) {
			if (everyInteger == intToFind) {
				matchCount = matchCount + 1;
			}
		}
		if (matchCount >= 2) {
			return true;
		}
		return false;
	}
	
	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
    should be replaced by the String "Fizz", any multiple of 5 should be replaced by the String "Buzz",
    and any multiple of both 3 and 5 should be replaced by the String "FizzBuzz"
    ** INTERVIEW QUESTION **	 
    
    fizzBuzzList( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 fizzBuzzList( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
	 
	 HINT: To convert an integer x to a string you can call x.toString() in your code (e.g. if x = 1 then x.ToString() equals "1")
	 */
	
	public List<String> fizzBuzzList(Integer[] integerArray) {
		
		List<String> fizzBuzzList = new ArrayList<String>();
		for (Integer nextItem : integerArray) {
			if (nextItem % 15 == 0) {
				fizzBuzzList.add("FizzBuzz");
			}
			else if (nextItem % 5 == 0) {
				fizzBuzzList.add("Buzz");
			}
			else if (nextItem % 3 == 0) {
				fizzBuzzList.add("Fizz");
			}
			else {
				fizzBuzzList.add(nextItem.toString());
			}
		}
		return fizzBuzzList;
	}

	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
		
		List<Integer> interleaveLists = new ArrayList<Integer>();
		
		while (listOne.size() > 0 || listTwo.size() > 0) {
			if (listOne.size() == 0) {
				interleaveLists.addAll(listTwo);
				return interleaveLists;
			}
			if (listTwo.size() == 0) {
				interleaveLists.addAll(listOne);
				return interleaveLists;
			}	
			interleaveLists.add(listOne.remove(0));
			interleaveLists.add(listTwo.remove(0));
		}
		return interleaveLists;
	}

	/*
	 Given a list of Integers representing seat numbers, group them into ranges 1-10, 11-20, and 21-30.
	 (Any seat number less than 1, or greater than 30 is invalid, and can be ignored.) Preserve the order
	 in which the seat number entered their associated group. Return a list of the grouped Integers 1-10,
	 11-20, and 21-30. (Hint: Think multiple queues)
	 boardingGate( [1, 13, 43, 22, 8, 11, 30, 2, 4, 14, 21] ) -> [1, 8, 2, 4, 13, 11, 14, 22, 30, 21]
	 boardingGate( [29, 19, 9, 21, 11, 1, 0, 25, 15, 5, 31] ) -> [9, 1, 5, 19, 11, 15, 29, 21, 25]
	 boardingGate( [0, -1, 44, 31, 17, 7, 27, 16, 26, 6] ) -> [7, 6, 17, 16, 27, 26]
	 */
	
	public List<Integer> boardingGate(List<Integer> seatNumberList) {
		
		List<Integer> seats1Through10 = new ArrayList<Integer>();
		List<Integer> seats11Through20 = new ArrayList<Integer>();
		List<Integer> seats21Through30 = new ArrayList<Integer>();
		for (int seats : seatNumberList) {
			
			if (seats >= 1 && seats <= 10) {
				seats1Through10.add(seats);
			}
			if (seats >= 11 && seats <= 20) {
				seats11Through20.add(seats);
			}
			if (seats >= 21 && seats <= 30) {
				seats21Through30.add(seats);
			}
			if (seats < 1 || seats > 30) {
			}
		}
		List<Integer> seats1Through30 = new ArrayList<Integer>();
		seats1Through30.addAll(seats1Through10);
		seats1Through30.addAll(seats11Through20);
		seats1Through30.addAll(seats21Through30);
		return seats1Through30;	
	}

}