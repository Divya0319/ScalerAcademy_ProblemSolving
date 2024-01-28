package main.ScalerAcademy.java._1_Arrays;

public class _2_SubArrayWithLeastAverage {
	
	/*
	 * 	Problem Description
		Given an array A of size N, find the subarray of size B with the least average.
		
		Problem Constraints
		1 <= B <= N <= 105
		-105 <= A[i] <= 105
		
		Example Input
		Input 1:
		A = [3, 7, 90, 20, 10, 50, 40]
		B = 3
		Input 2:
		A = [3, 7, 5, 20, -10, 0, 12]
		B = 2
		
		
		Example Output
		Output 1:
		3
		Output 2:
		4
	 */
	
	public static void main(String[] args) {
		
		_2_SubArrayWithLeastAverage sla = new _2_SubArrayWithLeastAverage();
		
		int[] A1 = new int[] {3, 7, 90, 20, 10, 50, 40};
		int[] A2 = new int[] {3, 7, 5, 20, -10, 0, 12};
		int B1 = 3;
		int B2 = 2;
		
		int minIndex = sla.subArrayWithLeastAverage(A2, B2);
		
		System.out.println("Min index of subarray wth least average : " + minIndex);
		
		
	}
	
	
	public int subArrayWithLeastAverage(int[] A, int B) {
		int min = Integer.MAX_VALUE;
		int n = A.length;
		
		int minIndex = 0;
		int sum = 0;
		
		// window size is equal to B
		// first window's sum calculated
		for(int i = 0; i < B; i++) {
			sum += A[i];
		}
		
		min = sum;
		
		for(int i = B; i < n; i++) {
			sum += A[i] - A[i-B]; // old windows element subtracted, new element added
			
			if(sum < min) {
				min = sum;
				minIndex = i-B+1;
			}
		}
		
		return minIndex;
	}
	

}
