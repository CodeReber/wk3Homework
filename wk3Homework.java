package wk3CodingAssignment;

import java.util.Arrays;

public class wk3Homework {

	public static void main(String[] args) {
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] array = {3,9,23,64,2,8,28,93};
		//Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		System.out.println(array[array.length - 1]);
		//Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		for (int i = 6; i >= 0; i--) {
			array[i + 1] = array[i];
		}
		array[7] = 20;
		System.out.println(array[array.length - 1]);
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		for (int number : array) {
			System.out.print(number + ",");
			
		}
		System.out.println("");
		
		double sum = 0;
		for (int number : array) {
			sum += number;
		}
		//System.out.println(sum);
		double average = sum / array.length;
		System.out.println(average);
		
		
		//System.out.println("\nQuestion# 2(a - c):");
		
		//String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
// 2.a Use a loop to iterate thru array & calc avg num of letters per name. Print.	
		
		//int sum2 = 0;
		
			//for(String str : names) {
			//	sum2 += str.length();
				
			//}
			
		//System.out.println(sum2 / names.length);
		
		
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		System.out.println("output");
		System.out.println(names.length);
		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int c = 0;
		for(String num : names) {
		    c += num.length();
			System.out.println(c);
		}
		System.out.println("result");
		System.out.println(c/(names.length));
		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.  
		String sumOfNames = "";
		for(String num : names) {
			sumOfNames += num + " ";
			 
		}
		System.out.println(sumOfNames);
		
		// How do you access the last element of any array?
		// You get the length of the array and then subtract -1
	
		//How do you access the first element of any array? 
		// the first element of any array will always be 0, so access using [0].
		
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
		}
		for(int num2 : nameLengths) {
			System.out.print(num2 + " ");
		}
		System.out.println("");
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console
		System.out.print(therepeater("Hello", 8));
		System.out.println("");
		//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		System.out.print(fullName("John", "Holmes"));
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
		System.out.println("");
		int [] numbers2 = {50,20};
		System.out.println(isGreaterThan100(numbers2));
		 
		//Write a method that takes an array of double and returns the average of all the elements in the array.
		double [] numbers3 = {50.6,20.4};
		System.out.println(avgDouble(numbers3));
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double [] numbers4 = {10.6,9.4};
		System.out.println(isFirstArrayGreater(numbers3, numbers4));
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println(gotHeatAndMoney(true, 12.6));
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		// Created a method called willIbeJavaDev to take in parameters that could lead to my success, I built this method for this homework assignment
		
		System.out.println(willIbeAJavaDev(true, true, true));

	}

	
	public static String therepeater(String word, int n) {
		String therepeater = "";
		for (int i = 0; i < n; i++) {
			therepeater += word;
		}
		return therepeater;
	}
	
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	public static Boolean isGreaterThan100(int[] array) {
		 
		return Arrays.stream(array).sum() > 100;
	}
	
	public static double avgDouble(double[] array) {
		 
		return Arrays.stream(array).average().orElse(Double.NaN);
	}
	
	public static boolean isFirstArrayGreater(double[] firstArray, double[] secondArray) {
		 
		return avgDouble(firstArray) > avgDouble(secondArray);
	}
	
	public static boolean gotHeatAndMoney(boolean isHotOutside, double moneyInPocket) {
		 
		return isHotOutside && moneyInPocket > 10.5;
	}
	public static boolean willIbeAJavaDev(boolean domyHomeWork, boolean WorkHard, boolean Jobsearch) {
		 
		return domyHomeWork && WorkHard && Jobsearch;
	}
	
	
	
	
		
}
