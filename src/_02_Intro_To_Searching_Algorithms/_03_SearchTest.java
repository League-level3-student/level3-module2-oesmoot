package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] Words = {"GALE", "aha aha i'm david", "bobdor", "herbert hunkdor's junk drawer", "augooey","tem forte tu"};
    	assertEquals(3, _01_LinearSearch.linearSearch(Words, "herbert hunkdor's junk drawer"));
    	assertEquals(-1, _01_LinearSearch.linearSearch(Words, "ya ya ya i am drew"));
    	assertEquals(5, _01_LinearSearch.linearSearch(Words, "tem forte tu"));
    
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] array = {1, 13, 20, 38, 47, 59, 60, 74, 92, 183, 451, 1384};
        assertEquals(10, _02_BinarySearch.binarySearch(array, 0, 11, 451));
        assertEquals(1,_02_BinarySearch.binarySearch(array, 0, 11, 13));
        assertEquals(-1, _02_BinarySearch.binarySearch(array, 0, 11, 2048));
    }
}
