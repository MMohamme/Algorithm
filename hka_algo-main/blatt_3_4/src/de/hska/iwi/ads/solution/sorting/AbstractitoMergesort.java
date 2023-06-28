

package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

abstract class AbstractitoMergesort<E extends Comparable<E>> extends AbstractMergesort<E> {

	@Override
	protected void mergesort(E[] a, int left, int right) {
		int m;
		if(left<right) {
			m=(left+right)/2;
			mergesort(a,left,m); // low to middle
			mergesort(a, m+1, right); // mid + 1 to heigh
			melt(a, left, m, right); // intergration
		
		}
	}
		protected abstract void melt(E[] a,int left ,int m,int right);

}
