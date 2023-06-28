
/**
 * @author wej1037
 */




package de.hska.iwi.ads.solution.sorting;



public class ReverseMergesort<E extends Comparable<E>> extends AbstractitoMergesort<E> {

		

	protected void melt(E[] a,int left ,int m,int right) {
		int l=left;
		int r = right;
		ReverseArray<E> turner = new ReverseArray<>();
		turner.reverse(a, m+1, r);
		
		for (int i = left;i<=right;i++) {
			
		
				if(a[l].compareTo(a[r])<=0) {
					b[i]=a[l];
					l++;
				}
				else {
					b[i]=a[r];
					r--;
				}
		}
		for (int i = left;i<=right;i++) {
			a[i]=b[i];
			
		}
		
	}

}
