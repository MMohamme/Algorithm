package de.hska.iwi.ads.search;

public interface Search<E extends Comparable<E>> {

  /**
  
   * @param a  sorted in ascending order given by the Comparable<E> implementation 
   * @param key 
   * @param left start index for the search, 0 <= left <= right
   * @param right end index for the search, 0 <= left <= right < a.length
   * 
   * @throws NullPointerException if a is null
   * @throws ArrayIndexOutOfBoundsException if left or right is not within the index bounds of <code>a</code>
   */
  public int search(E [] a, E key, int left, int right);
  
  /**
  

   * See {@link #search(Object[], Object, int, int)} with left = 0 and right = a.length - 1.
   */
  default int search(E [] a, E key) {
    return search(a, key, 0, a.length - 1);
  }
}
