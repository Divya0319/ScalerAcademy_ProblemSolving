package main.ScalerAcademy.java._1_Arrays;

public class _4_MaxSubArraySum_BruteForce {
	
	/*
	 * Given arr[N], find maximum subarray sum of all the subarrays
	 */
	
	public static void main(String[] args) {
		_4_MaxSubArraySum_BruteForce mss = new _4_MaxSubArraySum_BruteForce();
		int[] A = new int[] {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
		int maxSum = mss.maxSubArraySum(A);
		
		System.out.println("Max Subarray sum is : " + maxSum);
		
	}
	
	public int maxSubArraySum(int[] A) {
		int ans = Integer.MIN_VALUE;
		int n = A.length;
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				int sum = 0;
				for(int k = i; k <= j; k++) {
					sum += A[k];
					
					ans = Math.max(ans, sum);
				}
			}
		}
		
		
		return ans;
	}
	

}
