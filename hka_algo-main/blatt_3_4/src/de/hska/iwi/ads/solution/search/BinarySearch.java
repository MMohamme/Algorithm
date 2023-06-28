package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

	@Override
	public int search(E[] a, E key, int left, int right) {
  // Fall 1: key < a[left]
  if (key.compareTo(a[left]) < 0) {
	return left - 1;
}

// Fall 2: key > a[right]
     if (key.compareTo(a[right]) > 0) {
	  return right + 1;
}



// Durchsucht das Array iterativ
while (left <= right) {
	// Berechnet den mittleren Index
	int middle = left + (right - left) / 2;

	// Wenn der Schlüssel gefunden wurde
	if (a[middle].compareTo(key) == 0) {
		
		// Wenn es das erste Vorkommen des Schlüssels ist
		if (middle == 0 || !a[middle - 1].equals(key)) {
			System.out.print("Gesuchte nummer   "+key+"   in index    "+middle);
			return middle;
			
		}
		// Ansonsten wird der rechte Index aktualisiert
		right = middle - 1; //gesuchte index in linke seite
	} 


	// Wenn der Schlüssel größer als das mittlere Element ist
	else if (a[middle].compareTo(key) < 0) {
		// Aktualisiert den linken Index, gesuchte index in rechte seite
		left = middle + 1;
	} 
	// Wenn der Schlüssel kleiner als das mittlere Element ist
	else {
		// Aktualisiert den rechten Index, gesuchte index in linke seite
		right = middle - 1;
	}
}

// Fall 3: key ist nicht im Array, aber a[left] <= key <= a[right]
System.out.print("Gesuchte nummer liegt nicht in Index");
 return left;
}

	
		

	}
	
	


