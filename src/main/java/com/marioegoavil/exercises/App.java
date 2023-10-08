package com.marioegoavil.exercises;

/**
 * Solutions for exercises
 *
 */
public class App 
{
    public static boolean isPalindrome(String s) {
		if(s.length()<=1) return true;
		int i = 0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
    	
    	return true;
    }
    
	
	public static void main( String[] args )
    {
		System.out.println("practicing");
    }
}
