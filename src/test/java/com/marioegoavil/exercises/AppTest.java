package com.marioegoavil.exercises;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Testing the Palindrome Function
     */
    @Test
    public void palindromeTest()
    {
        assertEquals(true, App.isPalindrome("abba") );
        assertEquals(true, App.isPalindrome("kayak") );
        assertEquals(false, App.isPalindrome("hello") );
        assertEquals(false, App.isPalindrome("RACEACAR") );
        assertEquals(true, App.isPalindrome("A") );
        assertEquals(false, App.isPalindrome("ABCDABCD") );
    }
    
    @Test
    public void sumOfThreeNumbersTest()
    {
    	int[] intArray = new int[]{ 1,2,3 }; 
    	assertEquals(true, App.sumOfThreeNumbers(intArray,6)) ;
    	intArray = new int[]{ 1,-1,0 }; 
    	assertEquals(false, App.sumOfThreeNumbers(intArray,-1)) ;
    	intArray = new int[]{ 3,7,1,2,8,4,5 }; 
    	assertEquals(true, App.sumOfThreeNumbers(intArray,10)) ;
    	intArray = new int[]{ 3, 7, 1, 2, 8, 4, 5 }; 
    	assertEquals(false, App.sumOfThreeNumbers(intArray,21)) ;
    	intArray = new int[]{ -1, 2, 1, -4, 5, -3 }; 
    	assertEquals(true, App.sumOfThreeNumbers(intArray,-8)) ;
    	intArray = new int[]{ -1, 2, 1, -4, 5, -33 }; 
    	assertEquals(true, App.sumOfThreeNumbers(intArray,0)) ;
    }
}
