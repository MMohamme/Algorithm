package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

	@Override
	public int search(E[] a, E key, int left, int right) {

		int i = (left + right) / 2;
// Sonderfall 1
		if ( /* key < a[left] */ key.compareTo(a[left]) < 0) {
			return left - 1;
		}
// Sonderfall 2
		if ( /* key > a[right] */key.compareTo(a[right]) > 0) {
			return right + 1;
		}
		if (key == a[i]) {

// gleiche Werte
			if (i > 0 && a[i] == a[i - 1]) {

				return search(a, key, left, i--);
			}
			System.out.println(key + " an Position " + i + " enthalten.");
			return i;
		}
			
// Sonderfall 3
				if (right-left==1) {
					System.out.println("nummer nicht enthalten");
					return left + 1;
					
				}
// normale Binäre suche
				if (/* key > a[i] */ key.compareTo(a[i]) > 0) {
					return search(a, key, i, right);
				} 
				else if (/* key < a[i] */ key.compareTo(a[i]) < 0 && left != i) {
					return search(a, key, left, i);
				}
		return i;

	
		

	}
	
	

}
