package com.rama.coding.two_pointers;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PalindromeTest extends TestCase {
    
    public PalindromeTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( PalindromeTest.class );
    }

    public void testPalindrome()
    {
        assertTrue(Palindrome.isPalindrome("kayak") );
        assertTrue(!Palindrome.isPalindrome("hello") );
        assertTrue(!Palindrome.isPalindrome("RACEACAR") );
        assertTrue(Palindrome.isPalindrome("A") );
        assertTrue(!Palindrome.isPalindrome("ABCDABCD") );
        assertTrue(Palindrome.isPalindrome("DCBAABCD") );
        assertTrue(Palindrome.isPalindrome("ABCBA") );

    }
}
