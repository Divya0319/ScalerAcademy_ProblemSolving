package main.ScalerAcademy.java._1_Arrays;

public class _4_MaxSubArraySum_PrefSum {
	
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
		int n = A.length;
		int[] prefSum = new int[n];
		
		int ans = Integer.MIN_VALUE, sum = 0;
		
		prefSum[0] = A[0];
		
		for(int i = 1; i < n; i++) {
			prefSum[i] = prefSum[i-1] + A[i];
		}
		
		for(int i = 0; i < n; i++) {
			
			for(int j = i; j < n; j++) {
				if(i == 0) {
					sum = prefSum[j];
				} else {
					sum = prefSum[j] - prefSum[i-1];
				}
				
				ans = Math.max(ans,  sum);
			}
						
		}
		
		return ans;
		
	}

}
