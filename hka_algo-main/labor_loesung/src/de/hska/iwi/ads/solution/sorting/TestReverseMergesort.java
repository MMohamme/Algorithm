/**
 * @author Mohammad
 */

package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class TestReverseMergesort {

	@Test
	  void arrayInt() {
		Mergesort<Integer> sort = new Mergesort<>();
	    Integer [] a = {1 ,2 ,4 ,3 };
	    Integer [] b = {1 ,2 ,3 ,4 };
	    sort.sort(a);
	    System.out.println();
	    System.out.println("1. = ");
	    for (int i = 0; i < a.length; i++) {
	    	System.out.print(a[i]+",");
		} 
	    assertArrayEquals(b, a);
	  }

  
	
	@Test
	  void arrayInt2() {
		
		Mergesort<Integer> sort = new Mergesort<>();
	    Integer [] a = {1 ,2 ,7,5,100,4 ,3 };
	    Integer [] b = {1 ,2 ,3 ,4,5,7,100 };
	    sort.sort(a);
	    System.out.println("2.=");
	    for (int i = 0; i < a.length; i++) {
	    	System.out.print(a[i]+",");
		} 
	    assertArrayEquals(b, a);
	  }
	@Test
	  void arrayInt3() {
		
		Mergesort<Integer> sort = new Mergesort<>();
	    Integer [] a = {1 ,3,2 };
	    Integer [] b = {1 ,2 ,3  };
	    sort.sort(a);
	    System.out.println("3.=");
	    for (int i = 0; i < a.length; i++) {
	    	System.out.print(a[i]+",");
		} 
	    assertArrayEquals(b, a);
	  }
	@Test
	  void stabiltear() {
		
		Mergesort<Tester> sort = new Mergesort<Tester>();

		Tester t1_1 = new Tester (1,1);
		Tester t1_2 = new Tester (1,2);
		Tester t1_3 = new Tester (1,3);
		Tester t2_1 = new Tester (2,1);
		Tester t2_2 = new Tester (2,2);
		
	    Tester[] a = { t1_1,t2_1,t1_2,t1_3,t2_2};
	    Tester[] b = { t1_1,t1_2,t1_3,t2_1,t2_2};
	    sort.sort(a);
	    
	    assertArrayEquals(b, a);
	  }
	@Test
	  void stabiltear2() {
			
			Mergesort<Tester> sort = new Mergesort<Tester>();

			Tester t1_1 = new Tester (1,1);
			Tester t1_2 = new Tester (1,2);
			Tester t1_3 = new Tester (1,3);
			Tester t2_1 = new Tester (2,1);
			Tester t2_2 = new Tester (2,2);
			Tester t2_3 = new Tester (2,3);
			Tester t2_4 = new Tester (2,4);
			Tester t3_1 = new Tester (3,1);
			Tester t3_2 = new Tester (3,2);
			Tester t3_3 = new Tester (3,3);
			Tester t3_4 = new Tester (3,4);
			
		    Tester[] a = { t1_1,t2_1,t3_1,t3_2,t1_2,t1_3,t2_2,t3_3,t2_3,t3_4,t2_4};
		    Tester[] b = { t1_1,t1_2,t1_3,t2_1,t2_2,t2_3,t2_4,t3_1,t3_2,t3_3,t3_4};
		    sort.sort(a);
		    System.out.println();
		    for (int i = 0; i < a.length; i++) {
				System.out.print(a[i].x+"_"+a[i].y+",");
			}
		    System.out.println();
		    
		    assertArrayEquals(b, a);
		  }
	
	@Test
	  void lufzeit() {
			
			Mergesort<Integer> sort = new Mergesort<>();

			Integer[] a = new Integer[1000000];
		    Integer[] b = new Integer[1000000];
		   
		    for (int i = 0; i < b.length; i++) {
				a[i]=1;
				b[i]=1;
			}
			
		    
		    sort.sort(a);
		    
		    assertArrayEquals(b, a);
		  }
	
	@Test
	  void arrayInt5() {
		
		Mergesort<Integer> sort = new Mergesort<>();
	    Integer [] a = {1 ,3,2,3,5,6 };
	    Integer [] b = {1 ,2 ,3,3,5 ,6 };
	    sort.sort(a);
	    System.out.println("3.=");
	    for (int i = 0; i < a.length; i++) {
	    	System.out.print(a[i]+",");
		} 
	    assertArrayEquals(b, a);
	  }
	

}
