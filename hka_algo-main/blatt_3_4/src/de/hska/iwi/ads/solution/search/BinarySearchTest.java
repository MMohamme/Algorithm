package de.hska.iwi.ads.solution.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.search.LinearSearch;
import de.hska.iwi.ads.search.Search;
import de.hska.iwi.ads.search.SearchTest;

class BinarySearchTest extends SearchTest {



	@Override
	public <E extends Comparable<E>> Search<E> createSearch() {
		// TODO Auto-generated method stub
		return new BinarySearch<>();
	}
	
	
	 @Test
	  void balala() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {1, 1, 1, 1, 2, 3, 5, 7, 9};
	    
	    assertEquals(7, search.search(a, 6));
	  }
	 @Test
	  void balala2() {
	    Search<Character> search = createSearch();
	    Character [] a = {'1','1', '1', '1', '1', '1', '1', 'a', 'b'};
	    
	    assertEquals(7, search.search(a, 'a'));
	  }
	 @Test
	  void balala3() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {1,2,3,4,5,6,7,8,9};
	    
	    assertEquals(8, search.search(a, 9));
	  }
	 @Test
	 void balala4() {
		    Search<Integer> search = createSearch();
		    Integer [] a = {1,2,3,5,5,5,7,8,9};
		    
		    assertEquals(3, search.search(a, 4));
		  }
	 @Test
	 void balala5() {
		    Search<Integer> search = createSearch();
		    Integer [] a = {1,2,3,5,5,5,5,8,9};
		    
		    assertEquals(8, search.search(a, 7));
		  }
		  public static void main(String[] args) {
			Search<Integer> search = new BinarySearchTest().createSearch();
			Integer [] a = {1,2,3,5,5,5,5,8,9};
			search.search(a, 7);
		}
	
}
