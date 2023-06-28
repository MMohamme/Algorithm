/**
 * @author wej1037
 */


package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

abstract class AbstractitoMergesort<E extends Comparable<E>> extends AbstractMergesort<E> {

	@Override
	protected void mergesort(E[] a, int left, int right) {
		int m;
		if(left<right) {
			m=(left+right)/2;
			mergesort(a,left,m);
			mergesort(a, m+1, right);
			melt(a, left, m, right);
		
		}
	}
		protected abstract void melt(E[] a,int left ,int m,int right);

}
