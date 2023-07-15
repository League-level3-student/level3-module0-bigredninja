package _01_Simple_Array_Algorithms;

import java.util.Random;
import java.util.concurrent.ForkJoinWorkerThread;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun arrayfun = new MoreArrayFun();
		String[] monkey = { "one", "two", "three", "four" };
		Random rnd = new Random();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void stringPrint(String[] array) {
		for (int i = 0; i < array.length; i++) {
			String monkey1 = array[i];
			System.out.println(monkey1);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void stringReverse(String[] array) {
		for (int i = array.length-1; i >= 0; i--) {
			String monkey1 = array[i];
			System.out.println(monkey1);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	void stringEveryOther(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i%2 == 0) {
				System.out.println(array[i]);
			}
		}
	}
	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	void stringRandom(String[] array) {
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		
		}
	}
}
