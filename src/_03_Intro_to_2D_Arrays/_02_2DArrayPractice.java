package _03_Intro_to_2D_Arrays;

import java.util.Iterator;

/*
 *  A 2D array is comparable to a matrix/grid ordered by rows and columns.
 *  A 2D array that holds 3, 1D arrays with each 1D array having 3 elements
 *  can be thought of a 3x3 matrix/grid:
 *                 col0 col1 col2
 *                  \/   \/   \/
 *          row 0  { 1,  2,  3 }
 *          row 1  { 4,  5,  6 }
 *          row 2  { 7,  8,  9 }
 * 
 *  Where row 0 contains the numbers 1, 2, 3.
 *  and column 0 contains the numbers 1, 4, 7.
 * 
 *  Java stores a 2D array in 'row-major order', meaning the row number is
 *  the first number in the square brackets. The row 0 elements are:
 * 
 *  Row 0 = matrix[0][0], matrix[0][1], matrix[0][2]    // 1, 2, 3
 * 
 *  The second number in the square brackets is the column number.
 *  The column 0 elements are:
 * 
 *  Column 0 = matrix[0][0], matrix[1][0], matrix[2][0] // 1, 4, 7
 */
public class _02_2DArrayPractice {
	/*
	 * Return a 2D array that can accommodate the grid of values below: 0, 1, 2 3,
	 * 4, 5 6, 7, 8
	 */
	public Integer[][] test1() {
		Integer[][] newArray2d = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		return newArray2d;
	}

	/*
	 * Return a 2D array that can accommodate the grid of values below: "a", "b",
	 * "c", "d", "e", "f", "g", "e"
	 */
	public String[][] test2() {
		String[][] newArray2d = { { "a", "b", "c", "d" }, { "e", "f", "g", "e" }, };
		return newArray2d;
	}

	/*
	 * Return a 2D array that can accommodate the grid of values below: true, false,
	 * false, false, false, true, true, true, true, false
	 */
	public Boolean[][] test3() {
		Boolean[][] booleanArray = { { true, false }, { false, false }, { false, true }, { true, true },
				{ true, false }, };
		return booleanArray;
	}

	/*
	 * Draw the grid of values for the following 2D array of ints: Assume all the
	 * elements in the 2D array are initialized to random ints
	 * 
	 * int[][] grid = new int[2][3];
	 * 
	 * 
	 * 
	 * Show your teacher the grid you created
	 */

	/*
	 * Draw the grid of values for the following 2D array of Robots Assume all the
	 * elements in the 2D array are initialized.
	 * 
	 * Robot[][] robots = new Robot[4][2];
	 * 
	 * 
	 * 
	 * Show your teacher the grid you created
	 */

	/*
	 * Given the array of Objects below, return the element that is not null null,
	 * null, null, null null, null, null, Object
	 */
	public Object test4() {
		Object[][] objects = { { null, null, null, null }, { null, null, null, new Object() } };

		return objects[1][3];
	}

	/*
	 * Given the array of Objects below, return the element that is not null null,
	 * null, Object, null null, null, null, null
	 */
	public Object test5() {
		Object[][] objects = { { null, null, new Object(), null }, { null, null, null, null } };

		return objects[0][2];
	}

	/*
	 * Write an algorithm to return the sum of all the numbers in the first row (row
	 * 0)
	 */
	public Integer test6() {
		int temp2 = 0;
		int temp = 0;
		int[][] nums = { { 8, 7, 6, 5 }, { 4, 3 }, { 2, 1, 0 } };
		int[] row = nums[0];
		for (int i = 0; i < row.length; i++) {
			System.out.println();
			temp = temp + row[i];
		}
		return temp;
	}

	// this is a test
	// this is a test
	/*
	 * Write an algorithm to return the sum of all the numbers in the first column
	 * (column 0)
	 */
	public Integer test7() {
		int temp = 0;
		int temp4 = 0;
		int[][] nums = { { 8, 7, 6, 5 }, { 4, 3 }, { 2, 1, 0 } };

		for (int i = 0; i < 3; i++) {
			temp = temp + nums[i][0];
		}
		return temp;
	}

	/*
	 * Write an algorithm to return the sum of all the numbers in the specified row
	 */
	public Integer getSumByRow(int[][] matrix, int rowNum) {
		int sum = 0;
		// make a new array of the values that are the specified row
		int[] row = matrix[rowNum];
		// to add up all the values in the specified row
		for (int i = 0; i < row.length; i++) {
			// on every iteration add 1 item of the row to the previous sum
			sum = sum + row[i];
			System.out.println("sum =" + sum);
		}
		return sum;
	}

	/*
	 * Write an algorithm to return the sum of all the numbers in the specified
	 * column
	 */
	public Integer getSumByColumn(int[][] matrix, int col) {
		int sum = 0;
		// Find the length of the array
		int length = matrix.length;
		// iterate through all the rows
		for (int i = 0; i < length; i++) {
			// Iterate thru the rows and add a particular column;
			sum = sum + matrix[i][col];
		}
		return sum;
	}

	/*
	 * Return the value of the element adjacent to the specified row and column The
	 * directions East, West, North, South are relative to the 2D array matrix/grid.
	 * For example in this 3x3 2D array:
	 * 
	 * [1][2][3] [4][5][6] [7][8][9]
	 * 
	 * for the 5 in the middle (row = 1, column = 1), then East neighbor = 6 West
	 * neighbor = 4 North neighbor = 2 South neighbor = 8
	 * 
	 * 1. Assume input row and column values are valid indexes in the matrix. 2. If
	 * the neighbor does not exist, i.e. it's outside the grid boundaries, return
	 * null.
	 */
	public Integer getEastNeighbor(int[][] matrix, int rowIndex, int colIndex) {
		// add 1 to the col.
		// if the col is greater than the length of the max col then return null
		// if not return matrix with row,col+1
		int[] rowArray = matrix[rowIndex];
		int numColumns = rowArray.length;
		int eastIndex = colIndex + 1;
		if (eastIndex >= numColumns) {
			return null;
		} else {
			return rowArray[eastIndex];
		}
	}

	public Integer getWestNeighbor(int[][] matrix, int rowIndex, int colIndex) {
		// opisite of east neighbor, subtract 1 value to the location of the desired
		// number
		int[] rowArray = matrix[rowIndex];
		int westIndex = colIndex - 1;
		if (westIndex < 0) {
			return null;
		} else {
			return rowArray[westIndex];
		}
	}

	public Integer getNorthNeighbor(int[][] matrix, int rowIndex, int colIndex) {
		int numRows = matrix.length;
		if (rowIndex <= 0 || rowIndex >= numRows) {
			return null;
		}
		// [1] [2] [3]
		// [4] [5] [6]
		// [7] [8] [9]
		// [10][11][12]

		// Subtract 1 value from the location of the desired number on the row
		int northIndex = rowIndex - 1;
		return matrix[northIndex][colIndex];
	}

	public Integer getSouthNeighbor(int[][] matrix, int row, int col) {
		int numRows = matrix.length;
		if (row < -1 || row >= numRows-1) {
			return null;
		}
		// [1] [2] [3]
		// [4] [5] [6]
		// [7] [8] [9]
		// [10][11][12]

		int southIndex = row + 1;
		return matrix[southIndex][col];
	}
}
