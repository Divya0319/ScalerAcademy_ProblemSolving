package main.ScalerAcademy.java._1_Arrays;

public class _5_1_RainWaterTrapped_BruteForce {
	
	/*
	 * Given arr[N], where a[i] -> ht. of buildings
	 * Return the amount of water trapped on all the buildings
	 */
	
	public static void main(String[] args) {
		_5_1_RainWaterTrapped_BruteForce rwt = new _5_1_RainWaterTrapped_BruteForce();
		int[] A = new int[] {2,1,3,2,1,2,4,3,2,1,3,1};
		int waterTrapped = rwt.rainWaterTrapped(A);
		
		System.out.println("Water trapped : " + waterTrapped);
		
	}
	
	public int rainWaterTrapped(int[] A) {
		int n = A.length;
		int water = 0;
		
		for(int i = 0; i < n; i++) {
			int lmax = A[i];
			for(int j = 0; j < i; j++) {
				lmax = Math.max(lmax, A[j]);
			}
			
			int rmax = A[i];
			
			for(int j = i+1; j < n; j++) {
				rmax = Math.max(rmax,  A[j]);
			}
			
			water += Math.min(lmax, rmax) - A[i];
		}
		
		return water;
	}
	
}
