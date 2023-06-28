
package de.hska.iwi.ads.solution.sorting;


public class Mergesort<E extends Comparable<E>> extends AbstractitoMergesort<E> {

	protected void melt(E[] a,int left ,int m,int right) {
		int l=left;
		int r = m+1;
		
		for (int i = left;i<=right;i++) {
			
		
				if(r>right||(l<=m && a[l].compareTo(a[r])<=0)) {// lower kleiner als mittl und index lower kleiner als index mittel
					b[i]=a[l]; // lower zu neu arry hinzufügen
					l=l+1;
				}
				else {
					b[i]=a[r]; // mittl zu neu array hinufügen
					r++;
				}
		}
		for (int i = left;i<=right;i++) {
			a[i]=b[i]; // sortierte array wieder auf a[] zurücksetzten 
			
		}
		return;
	}

}
