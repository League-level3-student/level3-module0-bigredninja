package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
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
          String[] Numbers = new String[50];
          
          Numbers[0] = "0";
          Numbers[1] = "1";
          Numbers[2] = "2";
          Numbers[3] = "3";
          Numbers[4] = "4";
          Numbers[5] = "5";
          Numbers[6] = "6";
          Numbers[7] = "7";
          Numbers[8] = "8";
          Numbers[9] = "9";
          Numbers[10] = "10";
          Numbers[11] = "11";
          Numbers[12] = "12";
          Numbers[13] = "13";
          Numbers[14] = "14";
          Numbers[15] = "15";
          Numbers[16] = "16";
          Numbers[17] = "17";
          Numbers[18] = "18";
          Numbers[19] = "19";
          Numbers[20] = "20";
          Numbers[21] = "21";
          Numbers[22] = "22";
          Numbers[23] = "23";
          Numbers[24] = "24";
          Numbers[25] = "25";
          Numbers[26] = "26";
          Numbers[27] = "27";
          Numbers[28] = "28";
          Numbers[29] = "29";
          Numbers[30] = "30";
          Numbers[31] = "31";
          Numbers[32] = "32";
          Numbers[33] = "33";
          Numbers[34] = "34";
          Numbers[35] = "35";
          Numbers[36] = "36";
          Numbers[37] = "37";
          Numbers[38] = "38";
          Numbers[39] = "39";
          Numbers[40] = "40";
          Numbers[41] = "41";
          Numbers[42] = "42";
          Numbers[43] = "43";
          Numbers[44] = "44";
          Numbers[45] = "45";
          Numbers[46] = "46";
          Numbers[47] = "47";
          Numbers[48] = "48";
          Numbers[49] = "49";
        // 8. use a for loop to make every value of the integer array a random
        //    number

        // 9. without printing the entire array, print only the smallest number
        //    on the array

        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
