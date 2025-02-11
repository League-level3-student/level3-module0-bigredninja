package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
    	Random rnd = new Random();
        // 1. declare and Initialize an array 5 Strings
    	  String[] tamales = new String[5];
          
          tamales[0] = "res";
          tamales[1] = "verde";
          tamales[2] = "elote";
          tamales[3] = "puerco";
          tamales[4] = "rojo";

        // 2. print the third element in the array
          System.out.println(tamales[2]);
        // 3. set the third element to a different value
          tamales[2] = "queso";
        // 4. print the third element again
          System.out.println(tamales[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
          for (int i = 0; i < tamales.length; i++) {
        	    tamales[i]= "Tamales r good";
		}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
          for (int i = 0; i < tamales.length; i++) {
			System.out.println(tamales[i]);
		}
        // 7. make an array of 50 integers
          int[] numbers = new int[50];
        
			
		
         
        // 8. use a for loop to make every value of the integer array a random
        //    number
          for (int i = 0; i < numbers.length; i++) {
  			numbers[i] = rnd.nextInt();
  		}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
         int small = numbers[0];
          for (int i = 1; i < numbers.length; i++) {
			if (small > numbers[i]) {
				small = numbers[i];
			}
		}
          System.out.println(small);
        // 10 print the entire array to see if step 8 was correct
          for (int i : numbers) {
			System.out.println(i);
		}
        // 11. print the largest number in the array.
          int large = numbers[0];
          for (int i = 1; i < numbers.length; i++) {
			if (large < numbers[i]) {
				large = numbers[i];
			}
		}
          System.out.println(large);
        // 12. print only the last element in the array
          System.out.println(numbers.length-1);
    }
}
