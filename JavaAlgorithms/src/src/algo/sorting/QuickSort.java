package src.algo.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] inputArr = {2,5,6,74,3,6,73,6};
		quickSort(inputArr,0,inputArr.length -1 );
		System.out.println(Arrays.toString(inputArr));
		
		}
		
	public static String quickSort(int [] inputArr,int low,int high ) {
		
		if (inputArr == null ||inputArr.length ==0)
			return "Array length is zero";
		
		if(low>=high) {
			return "done";
		}
		
		int midIndex = low + (high-low)/2;
		int midpointArr = inputArr[midIndex];
		
		int lowPoint = low;
		int highPoint = high;

		while (lowPoint <= highPoint) {
			
			// TO get the first bigger element than mid Element from left 
			while( inputArr[lowPoint] < midpointArr) {
				lowPoint++;
			}
			
			// TO get the first lower element than mid Element from right 
			while( inputArr[highPoint] > midpointArr) {
				highPoint--;
			}
			if (lowPoint<=highPoint) {
				
				// replace elements in array to move lower elements on left and higher on right 
				int temp = inputArr[lowPoint];
				inputArr[lowPoint] = inputArr[highPoint];
				inputArr[highPoint]= temp;
				
				// to move the iterator ahead and back respectively and avoid infinite loop
				lowPoint++;
				highPoint--;
				
			}
		}
		// when lowPoint index becomes higher than highPoint index - Recursive call with new reduced highPoint
		if (low<highPoint) {
			quickSort(inputArr,low,highPoint);
		}
		if (high>lowPoint) {
			quickSort(inputArr,lowPoint,high);
		}
		return "done";
	}

}
