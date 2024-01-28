package main.ScalerAcademy.java._1_Arrays;

public class _3_LongestPalindromicSubString_Optimised {
	
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
		_3_LongestPalindromicSubString_Optimised lps = new _3_LongestPalindromicSubString_Optimised();
		String A = "aaaabaaa";
		String longestPalindrome = lps.longestPalindrome(A);
		
		System.out.println("Longest Palindrome in string is : " + longestPalindrome);
		
	}
	
	public String longestPalindrome(String A) {
		
		int n = A.length();
				
		if(n == 0 || n == 1) {
			return A;
		}
		
		
		String longest = A.substring(0, 1); // initialising longest string with 1 length
		
		
		for(int i = 0; i < n; i++) {
			
			
			// finding longest odd length substring
			String str1 = expandFromCentre(A, i-1, i+1);
			
			// if it is greater than previous longest string found, update longest
			if(str1.length() > longest.length()) {
				longest = str1;
			}
			
			// finding longest even length substring
			String str2 = expandFromCentre(A, i, i+1);
			
			// if it is greater than previous longest string found, update longest
			if(str2.length() > longest.length()) {
				longest = str2;
			}
		}
		
		return longest;
		
	}
	
	// This function finds out if expanding a string left to l index, right to r index, produces a palindrome or not
	public String expandFromCentre(String A, int l, int r) {
		
		int n = A.length();
		
		while(l >= 0 &&  r < n) {
			if(A.charAt(l) == A.charAt(r)) {
				l--;
				r++;
			} else {
				break;
			}
			
			
		}
		
		return A.substring(l+1, r);
	}

}
