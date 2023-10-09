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
    
    @Test
    public void removeNthLastNode() {
    	int[] intArray = new int[]{ 23,28,10,5,67,39,70,28 };
    	LinkedList lst = new LinkedList(null);
    	lst.createLinkedList(intArray);
    	System.out.println(lst.__str__());
    	App.removeNthLastNode(lst, 2);
		System.out.println(lst.__str__());
		
		intArray = new int[]{ 34,53,6,95,38,28,17,63,16,76 };
    	lst = new LinkedList(null);
    	lst.createLinkedList(intArray);
    	System.out.println(lst.__str__());
    	App.removeNthLastNode(lst, 3);
		System.out.println(lst.__str__());
		
		intArray = new int[]{ 288,224,275,390,4,383,330,60,193 };
    	lst = new LinkedList(null);
    	lst.createLinkedList(intArray);
    	System.out.println(lst.__str__());
    	App.removeNthLastNode(lst, 4);
		System.out.println(lst.__str__());
		
		intArray = new int[]{ 1,2,3,4,5,6,7,8,9 };
    	lst = new LinkedList(null);
    	lst.createLinkedList(intArray);
    	System.out.println(lst.__str__());
    	App.removeNthLastNode(lst, 1);
		System.out.println(lst.__str__());
		
		//This extreme case fails, need to work on the navigation through the LinkedList
		intArray = new int[]{ 69,8,49,106,116,112 };
    	lst = new LinkedList(null);
    	lst.createLinkedList(intArray);
    	System.out.println(lst.__str__());
    	App.removeNthLastNode(lst, 6);
		System.out.println(lst.__str__());
    }
}
