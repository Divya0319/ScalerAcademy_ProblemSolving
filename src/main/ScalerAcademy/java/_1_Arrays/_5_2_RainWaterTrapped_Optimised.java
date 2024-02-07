package main.ScalerAcademy.java._1_Arrays;

public class _5_2_RainWaterTrapped_Optimised {
	
	/*
	 * Given arr[N], find maximum subarray sum of all the subarrays
	 */
	
	public static void main(String[] args) {
		_5_2_RainWaterTrapped_Optimised rwt = new _5_2_RainWaterTrapped_Optimised();
		int[] A = new int[] {2,1,3,2,1,2,4,3,2,1,3,1};
		int waterTrapped = rwt.rainWaterTrapped(A);
		
		System.out.println("Water trapped : " + waterTrapped);
		
	}
	
	public int rainWaterTrapped(int[] A) {
		int n = A.length;
		int[] lmax = new int[n];
		int[] rmax = new int[n];
		
		lmax[0] = A[0];
		for(int i = 1; i < n; i++) {
			lmax[i] = Math.max(lmax[i-1], A[i]);
		}
		
		rmax[n-1] = A[n-1];
		for(int i = n-2; i >= 0; i--) {
			rmax[i] = Math.max(rmax[i+1], A[i]);
		}
		
		int water = 0;
		
		for(int i = 0; i < n; i++) {
			water += Math.min(lmax[i], rmax[i]) - A[i];
		}
		
		return water;
		
	}
	
}
