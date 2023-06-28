/**
 * @author Mohammad
 */

package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReverseArray {

	@Test
	void test() {
		ReverseArray<Integer> rev = new ReverseArray<>();
		Integer [] a = {1 ,2 ,3 ,4 };
	    Integer [] b = {4 ,3 ,2 ,1 };
	   rev.reverse(a, 0, 3);	   
	    assertArrayEquals(b, a);
	}
	@Test
	void test2() {
		ReverseArray<Integer> rev = new ReverseArray<>();
		Integer [] a = {1 ,2 ,3 ,4 ,5 ,6 };
	    Integer [] b = {1 ,2 ,3 ,6 ,5 ,4 };
	    rev.reverse(a, 3, 5);
	    for (Integer integer : a) {
			System.out.println(integer);
		}  
	    assertArrayEquals(b, a);
	}
	@Test
	void test3() {
		ReverseArray<Integer> rev = new ReverseArray<>();
		Integer [] a = {1 ,2 ,3 ,4 ,5 ,6 };
	    Integer [] b = {1 ,2 ,3 ,4 ,5 ,6 };
	    rev.reverse(a, -3, 5);	    
	    assertArrayEquals(b, a);
	}
	@Test
	void test4() {
		ReverseArray<Integer> rev = new ReverseArray<>();
		Integer [] a = {1 ,2 ,3 ,4 ,5 ,6 };
	    Integer [] b = {1 ,2 ,3 ,4 ,5 ,6 };
	    rev.reverse(a, 0, 1000);
	 	assertArrayEquals(b, a);
	}

	@Test
	void test5() {
		ReverseArray<Integer> rev = new ReverseArray<>();
		Integer [] a = {1 ,2 ,3 ,4 ,5 ,6, 7, 8, 9, 10, 11, 12, 13 };
		Integer [] b = {1 ,2 ,3 ,4 ,5 ,7, 6, 8, 9, 10, 11, 12, 13 };
	    rev.reverse(a, 5, 6);
	 	assertArrayEquals(b, a);
	}

	@Test
	void test6() {
		ReverseArray<Integer> rev = new ReverseArray<>();
		Integer [] a = {1};
		Integer [] b = {1};
	    rev.reverse(a, 0, 0);
	 	assertArrayEquals(b, a);
	}

	@Test
	void test7() {
		ReverseArray<Integer> rev = new ReverseArray<>();
		Integer [] a = {1, 2, 3};
		Integer [] b = {1, 2, 3};
	    rev.reverse(a, 0, 0);
	 	assertArrayEquals(b, a);
	}

}
