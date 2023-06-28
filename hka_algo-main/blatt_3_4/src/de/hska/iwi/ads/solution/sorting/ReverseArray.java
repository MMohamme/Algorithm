

package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

public class ReverseArray<E extends Comparable<E>> implements Reverse<E> {

	public ReverseArray() {}

	@Override
	public void reverse(E[] a, int from, int to) {
		
		
		E temp;
		if (0 <= from && from< to &&  to <= a.length - 1) {

			 for ( ;from <=to; from++,to--) {
				 temp = a[from];
				 a[from] = a[to];
				 a[to] = temp;
				
			}

		}
		
	}

}
