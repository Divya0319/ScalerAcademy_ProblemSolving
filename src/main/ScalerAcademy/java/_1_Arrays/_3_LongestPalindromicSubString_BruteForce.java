package main.ScalerAcademy.java._1_Arrays;

public class _3_LongestPalindromicSubString_BruteForce {
	
	/*
	 * Given a string A of size N, find and return the longest palindromic substring in A.

		Substring of string A is A[i...j] where 0 <= i <= j < len(A)
		
		Palindrome string:
		A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
		
		Incase of conflict, return the substring which occurs first ( with the least starting index).
		
		
		Problem Constraints
		1 <= N <= 6000
		
		Example Input
		Input 1:
		A = "aaaabaaa"
		Input 2:
		A = "abba
		
		Example Output
		Output 1:
		"aaabaaa"
		Output 2:
		"abba"
	 */
	
	public static void main(String[] args) {
		_3_LongestPalindromicSubString_BruteForce lps = new _3_LongestPalindromicSubString_BruteForce();
		String A = "aaaabaaa";
		String longestPalindrome = lps.longestPalindrome(A);
		
		System.out.println("Longest Palindrome in string is : " + longestPalindrome);
		
	}
	
	public String longestPalindrome(String A) {
		
		int n = A.length();
				
		if(n == 0 || n == 1) {
			return A;
		}
		
		
		int maxLen = 0;
		int startInd = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(isPalindrome(A, i, j)) {
					if(maxLen < j-i+1) {
						maxLen = j-i+1;
						startInd = i;
					}
				}
			}
		}
		
		
		return A.substring(startInd, startInd + maxLen);
	}
	
	public boolean isPalindrome(String A, int l, int r) {
		
		while(l < r) {
			if(A.charAt(l) != A.charAt(r)) {
				return false;
			}
			
			l++;
			r--;
		}
		
		return true;
	}

}
