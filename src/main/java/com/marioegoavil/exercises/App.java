package com.marioegoavil.exercises;

import java.util.Arrays;

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
    
    public static boolean sumOfThreeNumbers(int[] nums, int target) {
    	if(nums.length<3) return false;
    	Arrays.sort(nums);
    	int i=0; //pointer to the base number
    	int j, k; //pointers to the left and right pointers
    	int temptarget;
    	while(i<=nums.length-3) {
    		//loop for shifting the target sum of values
    		temptarget=target-nums[i];
    		j=i+1;
    		k=nums.length-1;
    		while(j<k) {
    			if(nums[j]+nums[k]==temptarget) return true;
    			if(nums[j]+nums[k]<temptarget) j++;
				if(nums[j]+nums[k]>temptarget)	k--;
    		}
    		i++;
    	}
    	return false;
    }
	
	public static void main( String[] args )
    {
		System.out.println("practicing");
    }
}
