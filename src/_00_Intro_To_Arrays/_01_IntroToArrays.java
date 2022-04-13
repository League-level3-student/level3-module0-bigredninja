package _00_Intro_To_Arrays;

import java.util.Iterator;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
    	Random rnd = new Random();
        // 1. declare and Initialize an array 5 Strings
    	  String[] Tamales = new String[5];
          
          Tamales[0] = "res";
          Tamales[1] = "verde";
          Tamales[2] = "elote";
          Tamales[3] = "puerco";
          Tamales[4] = "rojo";

        // 2. print the third element in the array
          System.out.println(Tamales[2]);
        // 3. set the third element to a different value
          Tamales[2] = "queso";
        // 4. print the third element again
          System.out.println(Tamales[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
          for (String string : Tamales) {
        	  Tamales[0] = "fresa";
              Tamales[1] = "masa";
              Tamales[2] = "hoja de banana";
              Tamales[3] = "pollo";
              Tamales[4] = "dulce";
		}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
          for (String string : Tamales) {
			System.out.println(Tamales[0] +" "+ Tamales[1] +" "+ Tamales[2] +" "+ Tamales[3] +" "+ Tamales[4]);
		}
        // 7. make an array of 50 integers
          int[] Numbers = new int[50];
         for (int i = 0; i < Numbers.length; i++) {
			Numbers[i] = rnd.nextInt();
		}
			
		
         
        // 8. use a for loop to make every value of the integer array a random
        //    number
          for (int integer : Numbers) {
        	System.out.println(integer);  
		}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
         int small = Numbers[0];
          for (int i = 0; i < Numbers.length; i++) {
			if (small < Numbers[i]) {
				System.out.println(small);
			}
		}
        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
