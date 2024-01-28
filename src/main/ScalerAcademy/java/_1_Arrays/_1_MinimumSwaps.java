package main.ScalerAcademy.java._1_Arrays;

public class _1_MinimumSwaps {
	
	/*
	 * Problem Description

	Given an array of integers A and an integer B, 
	find and return the minimum number of swaps required 
	to bring all the numbers less than or equal to B together.

	Note: It is possible to swap any two elements, not necessarily consecutive.

	Problem Constraints

	1 <= length of the array <= 100000
	-109 <= A[i], B <= 109
	
	Input 1:

 	A = [1, 12, 10, 3, 14, 10, 5]
 	B = 8
 	
 	Output 1:
 	2	
	 */
	public static void main(String[] args) {
		int[] A1 = new int[] {1, 12, 10, 3, 14, 10, 5};
		int[] A2 = new int[] {5, 17, 100, 11};
		int B1 = 8;
		int B2 = 20;
		
		_1_MinimumSwaps ms = new _1_MinimumSwaps();
		
		int minSwaps = ms.minSwaps(A2, B2);
		
		System.out.println("Minimum swaps : " + minSwaps);
		
	}
	
	public int minSwaps(int[] A, int B) {
		int n = A.length;
		
		int ans = 0; // returns final ans
		
		int countLess = 0; // stores number of elements less than B
		
		
		// counting numner of elements less than B here
		for(int i = 0; i < n; i++) {
			if(A[i] <= B) {
				countLess++;
			}
		}
		
		// if only 1, or no element less than B, no swapping needed
		if(countLess <= 1) {
			return 0;
		}
		
		else {
			
			// l holds left index of window, r holds right index
			// badNos holds number of elements in window which are undesirable(>B)
			// badNos only tells how many elements are to be swapped in a window of size=countLess
			int l, r, badNos;
			l = r = badNos = 0;
			
			// counting badNos for first window
			while(r < countLess) {
				if(A[r] > B) {
					badNos++;
				}
				
				r++;
			}
			
			// updating ans with badNos found in 1st window
			ans = badNos;
			
			// counting badNos for rest of windows of size=countLess
			while(r < n) {
				// element coming in window from right is bad No.
				if(A[r] > B) {
					badNos++;
				} // element removed from window on left was bad No.
				if(A[l] > B) {
					badNos--;
				}
				
				// finding minimum value from badNos and ans
				ans = Math.max(ans, badNos);
				
				// moving window to right
				l++;
				r++;
			}
		}
		
		
		return ans;
		
	}

}
