package _01_Simple_Array_Algorithms;

import java.util.Random;
import java.util.concurrent.ForkJoinWorkerThread;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {

		String[] monkey = { "one", "two", "three", "four" };
		MoreArrayFun arrayfun = new MoreArrayFun();
		arrayfun.stringPrint(monkey);
		arrayfun.stringReverse(monkey);
		arrayfun.stringEveryOther(monkey);
		arrayfun.stringRandom(monkey);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void stringPrint(String[] array) {
		System.out.println("*** stringPrint ***");
		for (int i = 0; i < array.length; i++) {
			String monkey1 = array[i];
			System.out.println(monkey1);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void stringReverse(String[] array) {
		System.out.println("*** stringReverse ***");
		for (int i = array.length - 1; i >= 0; i--) {
			String monkey1 = array[i];
			System.out.println(monkey1);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	void stringEveryOther(String[] array) {
		System.out.println("*** stringEveryOther ***");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	void stringRandom(String[] array) {
		System.out.println("*** stringRandom ***");
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			int rando = rnd.nextInt(array.length);
			System.out.println(array[rando]);

		}
	}
}
