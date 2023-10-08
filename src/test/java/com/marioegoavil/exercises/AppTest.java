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
}
