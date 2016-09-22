/****************************************************************************
 *
 * Created by: Jess and Craig, with some fantastic help from michael
 * Created on: Sept 2016
 * This program fills an array with 10 numbers and returns the max and min
 *  values
 ****************************************************************************/


public class MARK {

	public static int ClassAverage (int [][] markArray){
		//fills up the array with random numbers
		int total = 0;
		
		for (int x = 0; x < markArray.length; x++){
			//does the thing
			for (int y = 0; y < markArray[0].length; y++){
				markArray[x][y] = (int)(Math.random()*100 + 1);
				System.out.println(markArray[x][y]);
				total = total + markArray[x][y];
				//System.out.println("total: " + total);
			}
		}
		int average = total / (markArray.length * markArray[0].length);
		return average;
	}
	
	public static void main(String[] args) {
		// Creating Array
		int[][] markArray = new int[4][6];
		
		int average = ClassAverage(markArray);
		//finding average
		
		System.out.println("The average is: " + average);
		
	}

}
