package main.ScalerAcademy.java._1_Arrays;

public class _4_4_MaxSubArraySum_KadaneAlgo {
	
	/*
	 * Given arr[N], find maximum subarray sum of all the subarrays
	 */
	
	public static void main(String[] args) {
		_4_4_MaxSubArraySum_KadaneAlgo mss = new _4_4_MaxSubArraySum_KadaneAlgo();
		int[] A = new int[] {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
		int maxSum = mss.maxSubArraySum(A);
		
		System.out.println("Max Subarray sum is : " + maxSum);
		
	}
	
	public int maxSubArraySum(int[] A) {
		int n = A.length;
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += A[i];
			
			ans = Math.max(ans, sum);
			
			if(sum < 0) {
				sum = 0;
				
			}
		}
		
		return ans;
		
	}
	
}
